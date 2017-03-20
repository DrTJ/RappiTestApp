package com.rappi.rappitest.ViewContracts;

import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by Dr TJ on January 2017.
 */

public interface ICategoriesViewContract extends IViewContract {
    void SetAdapter(BaseAdapter adapter, boolean isTablet);
}
