package com.gundf.fertighaus.activities;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.gundf.fertighaus.R;
import com.gundf.fertighaus.adpters.GalleryAdapter;
import com.gundf.fertighaus.models.gallery.CategoryItemContent;
import com.gundf.fertighaus.models.gallery.GalleryItemContent;

public class GalleryListActivity extends Activity {

    private GridView mGridView;
    private CategoryItemContent mCategoryItemContent;
    private GalleryAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCategoryItemContent = getIntent().getParcelableExtra(CategoryItemContent.EXTRA_CATEGORY_ITEM_CONTENT);
        setContentView(R.layout.activity_gallery);
        mGridView = (GridView) findViewById(R.id.grid_view);
        mAdapter = new GalleryAdapter(this, GalleryItemContent.getTestList(mCategoryItemContent.getID()));
        mGridView.setAdapter(mAdapter);
        initActionBar();
    }

    private void initActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(mCategoryItemContent.getName());
    }

    private AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            GalleryItemContent galleryItemContent = mAdapter.getItem(position);
//            Intent i = new Intent(GalleryListActivity.this, .class);
//            i.putExtra(GalleryItemContent.EXTRA_GALLERY_ITEM_CONTENT, galleryItemContent);
//            startActivity(i);
        }
    };

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
