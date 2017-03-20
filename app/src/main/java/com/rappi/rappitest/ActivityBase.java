package com.rappi.rappitest;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import ir.royapajoohesh.utils.ActivityUtils;
import ir.royapajoohesh.utils.Orientations;

/**
 * Created by Dr TJ on February 2017.
 */
public class ActivityBase<TPresenter> extends AppCompatActivity {
    private static final String TAG = "ActivityBase";

    public TPresenter Presenter;

    public boolean ShowBackButton = true;
    public View toolbarShadow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Check the orientation
        ActivityUtils.SetOrientation(this, Orientations.Landscape, Orientations.Portrait);
    }

    @Override
    protected void onResume() {
        super.onResume();
        CreateToolbar();
    }

    public void CreateToolbar() {
        Toolbar toolbar = (Toolbar) this.findViewById(R.id.pageToolbar).findViewById(R.id.toolbarWidget);
        if (toolbar == null) {
            return;
        }

        this.toolbarShadow = this.findViewById(R.id.pageToolbar).findViewById(R.id.toolbar_shadow);

        setSupportActionBar(toolbar);

        ActionBar tmpActionBar = getSupportActionBar();
        if(tmpActionBar == null){
            return;
        }

        if (ShowBackButton) {
            tmpActionBar.setHomeButtonEnabled(true);
            tmpActionBar.setDisplayHomeAsUpEnabled(true);
        }

        tmpActionBar.setDisplayUseLogoEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}