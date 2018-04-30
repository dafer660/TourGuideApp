package com.example.danie.tourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentTourAdapter extends FragmentPagerAdapter{

    final int NUM_ITEMS = 4;
    private Context context;

    public FragmentTourAdapter(FragmentManager fm, Context aContext) {
        super(fm);
        context = aContext;
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new RestaurantFragment();
            case 1:
                return new EventFragment();
            case 2:
                return new NightlifeFragment();
            case 3:
                return new HistoricFragment();
            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.restaurant);
            case 1:
                return context.getString(R.string.events);
            case 2:
                return context.getString(R.string.nightlife);
            case 3:
                return context.getString(R.string.historic);
            default:
                return null;
        }
    }
}
