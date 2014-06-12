package com.gundf.fertighaus.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.gundf.fertighaus.R;
import com.gundf.fertighaus.adpters.PanoramaAdapter;
import com.gundf.fertighaus.models.panoramas.PanoramaItemContent;

import java.util.List;

public class PanoramasFragment extends Fragment {

    private GridView mGridView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_panoramas, null);
        mGridView = (GridView) view.findViewById(R.id.grid_view);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        List<PanoramaItemContent> items = PanoramaItemContent.getTestList();
        PanoramaAdapter adapter = new PanoramaAdapter(getActivity(), items);
        mGridView.setAdapter(adapter);
    }
}
