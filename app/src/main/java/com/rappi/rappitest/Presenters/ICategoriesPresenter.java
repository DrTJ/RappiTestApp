package com.rappi.rappitest.Presenters;

import android.widget.AdapterView;

import com.rappi.rappitest.Models.RedditData;

import java.util.ArrayList;

/**
 * Created by Dr TJ on February 2017.
 */
public interface ICategoriesPresenter extends IPresenter {
    ArrayList<RedditData> getCategoriesList();

    ArrayList<RedditData> DownloadData();

    void ReloadData();

    void ShowItemDetails(RedditData item);

    ArrayList<RedditData> LoadFromDatabase();

    AdapterView.OnItemClickListener ListItemClicked();
}
