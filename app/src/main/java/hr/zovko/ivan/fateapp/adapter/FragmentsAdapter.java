package hr.zovko.ivan.fateapp.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import hr.zovko.ivan.fateapp.fragments.FAEFragment;
import hr.zovko.ivan.fateapp.fragments.FateCoreFragment;
import hr.zovko.ivan.fateapp.fragments.RollDiceFragment;

public class FragmentsAdapter extends FragmentPagerAdapter {

    public FragmentsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {    //position ide od nule!
            return RollDiceFragment.newInstance();
        } else if (position == 1) {
            return FAEFragment.newInstance();
        } else if (position == 2) {
            return FateCoreFragment.newInstance();
        } else {
            return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
