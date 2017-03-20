package com.rappi.rappitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rappi.rappitest.Presenters.CategoriesPresenter;
import com.rappi.rappitest.Presenters.ICategoriesPresenter;

public class MainActivity extends ActivityBase<ICategoriesPresenter> implements ICategoriesViewContract  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.Presenter = new CategoriesPresenter()
    }
}
