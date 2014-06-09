package com.gundf.fertighaus.fragments;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.gundf.fertighaus.R;
import com.gundf.fertighaus.adpters.MenuAdapter;

public class MenuFragment extends ListFragment {

    public interface NavigationCallbacks {
        public void direction(Class navigate);
    }

    private NavigationCallbacks mCallbacks;
    private MenuAdapter mMenuAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMenuAdapter = new MenuAdapter(getActivity());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, null);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ListView listView = getListView();
        View header = getActivity().getLayoutInflater().
                inflate(R.layout.header_menu, listView, false);
        listView.addHeaderView(header, null, false);
        listView.setAdapter(mMenuAdapter);
    }
}
