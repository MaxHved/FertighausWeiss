package com.gundf.fertighaus.enumerable;

import com.gundf.fertighaus.R;

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
}
