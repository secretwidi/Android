package com.digowidi.listview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import java.util.List;

public class PageAdapter extends FragmentStatePagerAdapter {
    int countfrag;

    public PageAdapter(FragmentManager fm, int countfrag) {
        super(fm);
        this.countfrag = countfrag;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 1:
                FragmentSatu FragmentSatu = new FragmentSatu();
                return FragmentSatu;
            case 2:
                FragmentDua FragmentDua = new FragmentDua();
                return FragmentDua;
            case 3:
                FragmentTiga FragmentTiga = new FragmentTiga();
                return FragmentTiga;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return countfrag;
    }
}
