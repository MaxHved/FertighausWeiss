package com.gundf.fertighaus.enumerable;

import android.app.Fragment;

import com.gundf.fertighaus.R;
import com.gundf.fertighaus.fragments.AugmentedRealityFragment;
import com.gundf.fertighaus.fragments.CatalogFragment;
import com.gundf.fertighaus.fragments.CustomMapFragment;
import com.gundf.fertighaus.fragments.GalleryHousesFragment;
import com.gundf.fertighaus.fragments.InfoFragment;
import com.gundf.fertighaus.fragments.NewsFragment;
import com.gundf.fertighaus.fragments.PanoramasFragment;

public enum MenuItems {

    GALLERY(
            R.string.label_menu_gallery,
            R.drawable.ic_menu_gallery
    ),
    NEWS(
            R.string.label_menu_news,
            R.drawable.ic_menu_news
    ),
    CATALOG(
            R.string.label_menu_catalog,
            R.drawable.ic_menu_catalog
    ),
    PANORAMA(
            R.string.label_menu_panorama,
            R.drawable.ic_menu_panorama
    ),
    AUGMENTED_REALITY(
            R.string.label_menu_augmented_reality,
            R.drawable.ic_menu_augmented_reality
    ),
    MAP(
            R.string.label_menu_map,
            R.drawable.ic_menu_map
    ),
    INFO(
            R.string.label_menu_info,
            R.drawable.ic_menu_info
    );

    private int mIdLabel;
    private int mIdImage;

    MenuItems(int idLabel, int idImage) {
        mIdLabel = idLabel;
        mIdImage = idImage;
    }

    public int getIdLabel() {
        return mIdLabel;
    }

    public int getIdImage() {
        return mIdImage;
    }

    public Fragment getFragment() {
        Fragment fragment;
        switch (this) {
            case GALLERY:
                fragment = new GalleryHousesFragment();
                break;
            case NEWS:
                fragment = new NewsFragment();
                break;
            case CATALOG:
                fragment = new CatalogFragment();
                break;
            case PANORAMA:
                fragment = new PanoramasFragment();
                break;
            case AUGMENTED_REALITY:
                fragment = new AugmentedRealityFragment();
                break;
            case MAP:
                fragment = new CustomMapFragment();
                break;
            case  INFO:
                fragment = new InfoFragment();
                break;
            default:
                fragment = null;
        }
        return fragment;
    }
}
