package com.ramakuma.shubhmuhurtam;

/**
 * Created by ramakuma on 14-05-2017.
 */


        import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentManager;
        import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                about tab1 = new about();
                return tab1;
            case 1:
                catering tab2 = new catering();
                return tab2;
            case 2:
                team tab3 = new team();
                return tab3;
            case 3:
                contact_us tab4 = new contact_us();
                return tab4;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "About";
            case 1:
                return "Catering";
            case 2:
                return "Team";

            case 3:
                return "Contact us";
        }
        return null;
    }
}