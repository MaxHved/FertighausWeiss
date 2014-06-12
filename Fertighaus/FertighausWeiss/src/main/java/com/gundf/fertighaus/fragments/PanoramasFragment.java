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
import com.gundf.fertighaus.activities.PanoramaViewActivity;
import com.gundf.fertighaus.adpters.PanoramaAdapter;
import com.gundf.fertighaus.models.panoramas.PanoramaItemContent;

import java.util.List;

public class PanoramasFragment extends Fragment {

    private GridView mGridView;
    private PanoramaAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_panoramas, null);
        mGridView = (GridView) view.findViewById(R.id.grid_view);
        mGridView.setOnItemClickListener(mItemClickListener);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        List<PanoramaItemContent> items = PanoramaItemContent.getTestList();
        mAdapter = new PanoramaAdapter(getActivity(), items);
        mGridView.setAdapter(mAdapter);
    }

    private AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            PanoramaItemContent panoramaItemContent = mAdapter.getItem(position);
            Intent i = new Intent(getActivity(), PanoramaViewActivity.class);
            i.putExtra(PanoramaItemContent.EXTRA_PANORAMA_ITEM_CONTENT, panoramaItemContent);
            startActivity(i);
        }
    };
}
