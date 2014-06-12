package com.gundf.fertighaus.fragments;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.gundf.fertighaus.R;
import com.gundf.fertighaus.activities.GalleryListActivity;
import com.gundf.fertighaus.adpters.СategoryAdapter;
import com.gundf.fertighaus.models.gallery.CategoryItemContent;

import java.util.List;

public class GalleryHousesFragment extends Fragment {

    private GridView mGridView;
    private СategoryAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery_house, null);
        mGridView = (GridView) view.findViewById(R.id.grid_view);
        mGridView.setOnItemClickListener(mItemClickListener);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        List<CategoryItemContent> items = CategoryItemContent.getTestList();
        mAdapter = new СategoryAdapter(getActivity(), items);
        mGridView.setAdapter(mAdapter);
    }

    private AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            CategoryItemContent categoryItemContent = mAdapter.getItem(position);
            Intent i = new Intent(getActivity(), GalleryListActivity.class);
            i.putExtra(CategoryItemContent.EXTRA_CATEGORY_ITEM_CONTENT, categoryItemContent);
            startActivity(i);
        }
    };
}
