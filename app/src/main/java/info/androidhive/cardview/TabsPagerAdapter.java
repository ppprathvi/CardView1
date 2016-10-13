package info.androidhive.cardview;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import layout.BookFragment;
import layout.InfoFragment;
import layout.MenuFragment;

/**
 * Created by Prathviraj Patil on 11/10/16.
 */
//Extending FragmentStatePagerAdapter
public class TabsPagerAdapter extends FragmentStatePagerAdapter {
    //integer to count number of tabs
    int tabCount;
    //Constructor to the class

    public TabsPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount = tabCount;
    }

    //Overriding method getItem
    @Override


    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                MenuFragment tab1 = new MenuFragment();
                return tab1;
            case 1:
                InfoFragment tab2 = new InfoFragment();
                return tab2;
            case 2:
                BookFragment tab3 = new BookFragment();
                return tab3;
            default:
                return null;
        }
    }


    //Overriden method getCount to get the number of tabs

    @Override


    public int getCount() {
        return tabCount;
    }
}