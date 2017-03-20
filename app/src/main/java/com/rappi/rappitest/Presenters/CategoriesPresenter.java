package com.rappi.rappitest.Presenters;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;

import com.rappi.rappitest.ActivityBase;
import com.rappi.rappitest.Models.RedditData;
import com.rappi.rappitest.ViewContracts.ICategoriesViewContract;
import com.rappi.rappitest.ViewContracts.IViewContract;

import java.util.ArrayList;

import ir.royapajoohesh.utils.ActivityUtils;
import ir.royapajoohesh.utils.Providers.DialogsProvider;
import ir.royapajoohesh.utils.Providers.NavigationProvider;
import ir.royapajoohesh.utils.Providers.NetworkStatusProvider;

/**
 * Created by Dr TJ on February 2017.
 */
public class CategoriesPresenter implements ICategoriesPresenter {
    public static ArrayList<RedditData> CategoriesList;
    private final Bundle bundleState;
    private ICategoriesViewContract viewContract;

    private ActivityBase<com.grability.grabilitytest.Presenters.ICategoriesPresenter> context;

    public CategoriesPresenter(ICategoriesViewContract viewContract, Bundle savedInstanceState) {
        CategoriesList = new ArrayList<>();
        this.viewContract = viewContract;
        this.context = (ActivityBase<ICategoriesPresenter>) viewContract;

        this.context.ShowBackButton = false;

        this.bundleState = savedInstanceState;
        this.ReloadData();
    }

    @Override
    public ArrayList<RedditData> getCategoriesList() {
        return CategoriesList;
    }

    @Override
    public ArrayList<RedditData> DownloadData() {
        // Test Internet connection and type before trying to download
        boolean netStatus = NetworkStatusProvider.InternetAccess(this.context);
        if (!netStatus) {
            DialogsProvider.DisplayAlert(this.context, R.string.no_connection_error_title, R.string.no_connection_error_message);
            return new ArrayList<>();
        }

        // Download data
        ArrayList<RedditData> result = LoadingFragment.StartDownloading(context, bundleState, context.getSupportFragmentManager(), null);
        //        , new OperationListener() {
        //            @Override
        //            public void onSucceed() {
        //                ReloadData();
        //            }
        //
        //            @Override
        //            public void onError(String data) {
        //                ReloadData();
        //            }
        //        }
        // ArrayList<AppCategories> result = iTunesDownloader.DownloadData(this.context, null);

        // Delete the existing data

        RedditData.DeleteAll(this.context);

        if (result == null || result.size() == 0) {
            return result;
        }

        // Save them to the local database
        RedditData.AddAll(this.context, result, true, true);

        // Return the result
        return result;
    }

    @Override
    public ArrayList<RedditData> LoadFromDatabase() {
        return RedditData.Get(this.context);
    }

    @Override
    public AdapterView.OnItemClickListener ListItemClicked() {
        return new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("AppCategory", "Item " + id + " clicked!");
                ShowCategoryAppsList(getCategoriesList().get(position));
            }
        };
    }

    @Override
    public void ReloadData() {
        // try to download data if there is internet connection.
        CategoriesList = this.DownloadData();

        // if downloading data failed, load what we have in local database
        if (CategoriesList.size() == 0) {

            // Load from database if there is any...
            if (RedditData.GetCount(this.context) > 0) {
                DialogsProvider.DisplayAlert(this.context, "Warning", "Downloading data from the server failed. The data has been loaded from local storage...");
                CategoriesList = this.LoadFromDatabase();
            } else {
                DialogsProvider.DisplayAlert(this.context, "Error", "No data could be loaded!\nTry again later.");
            }
        }

        boolean isTablet = ActivityUtils.isTablet(this.context);
        int viewType = isTablet ? ViewType.Grid : ViewType.List;
        AppCategoriesAdapter adapter = new AppCategoriesAdapter(this.context, CategoriesList, viewType);

        this.viewContract.SetAdapter(adapter, isTablet);
    }

    @Override
    public void ShowItemDetails(RedditData item) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(AppsListActivity.BundleKey_LoadByCategory, item);

        NavigationProvider.NavigateTo(this.context, AppsListActivity.class, true, bundle);
    }

    @Override
    public IViewContract getViewContract() {
        return this.viewContract;
    }
}
