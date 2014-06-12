package com.gundf.fertighaus.activities;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.maps.MapsInitializer;
import com.gundf.fertighaus.R;
import com.gundf.fertighaus.enumerable.MenuItems;
import com.gundf.fertighaus.fragments.GalleryHousesFragment;
import com.gundf.fertighaus.fragments.MenuFragment;
import com.gundf.fertighaus.fragments.RequestFragment;


public class MainActivity extends Activity implements MenuFragment.NavigationCallbacks {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;

    private Fragment mMenuFragment;
    private Fragment mContainerFragment;
    private Fragment mRequestFragment;

    private int mIdTitle = R.string.label_menu_gallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm = getFragmentManager();
        mContainerFragment = fm.findFragmentById(R.id.content_frame);
        if(mContainerFragment == null) {
            updateContentFragment(new GalleryHousesFragment());
        }
        mMenuFragment = fm.findFragmentById(R.id.left_frame);
        if(mMenuFragment == null) {
            mMenuFragment = new MenuFragment();
            fm.beginTransaction().
                    add(R.id.left_frame, mMenuFragment).
                    commit();
        }
        mRequestFragment = fm.findFragmentById(R.id.right_frame);
        if(mRequestFragment == null) {
            mRequestFragment = new RequestFragment();
            fm.beginTransaction().
                    add(R.id.right_frame, mRequestFragment).
                    commit();
        }
        initDrawerLayout();
        initActionBar();

        MapsInitializer.initialize(this);
    }

    private void initDrawerLayout() {
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow_right, Gravity.RIGHT);
        mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow_left, Gravity.LEFT);
        mDrawerToggle = new ActionBarDrawerToggle(this,
                mDrawerLayout, R.drawable.ic_drawer,
                R.string.drawer_open, R.string.drawer_close) {
            @Override
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                getActionBar().setTitle(mIdTitle);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                if(mDrawerLayout.isDrawerOpen(Gravity.LEFT)) {
                    getActionBar().setTitle(R.string.label_menu);
                } else if(mDrawerLayout.isDrawerOpen(Gravity.RIGHT)) {
                    getActionBar().setTitle(R.string.label_contact);
                }
            }

        };
        mDrawerLayout.setDrawerListener(mDrawerToggle);
    }

    private void initActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setTitle(mIdTitle);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main_activity, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                if(mDrawerLayout.isDrawerOpen(Gravity.LEFT)) {
                    mDrawerLayout.closeDrawer(Gravity.LEFT);
                } else {
                    if(mDrawerLayout.isDrawerOpen(Gravity.RIGHT)) {
                        mDrawerLayout.closeDrawer(Gravity.RIGHT);
                    }
                    mDrawerLayout.openDrawer(Gravity.LEFT);
                }
                return true;
            case R.id.request_form:
                if(mDrawerLayout.isDrawerOpen(Gravity.LEFT)) {
                    mDrawerLayout.closeDrawer(Gravity.LEFT);
                }
                if(mDrawerLayout.isDrawerOpen(Gravity.RIGHT)) {
                    mDrawerLayout.closeDrawer(Gravity.RIGHT);
                } else {
                    mDrawerLayout.openDrawer(Gravity.RIGHT);
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    @Override
    public void direction(MenuItems item) {
        mIdTitle = item.getIdLabel();
        getActionBar().setTitle(mIdTitle);
        updateContentFragment(item.getFragment());
        mDrawerLayout.closeDrawer(Gravity.LEFT);
    }

    private void updateContentFragment(Fragment fragment) {
        mContainerFragment = fragment;
        FragmentManager fm = getFragmentManager();
        fm.beginTransaction().
                replace(R.id.content_frame, mContainerFragment).
                commit();
    }
}
