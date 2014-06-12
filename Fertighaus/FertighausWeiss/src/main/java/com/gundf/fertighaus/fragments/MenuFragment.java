package com.gundf.fertighaus.fragments;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.gundf.fertighaus.R;
import com.gundf.fertighaus.adpters.MenuAdapter;
import com.gundf.fertighaus.enumerable.MenuItems;

public class MenuFragment extends ListFragment {

    public interface NavigationCallbacks {
        public void direction(MenuItems item);
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
        return inflater.inflate(R.layout.fragment_menu, null);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ListView listView = getListView();
        View header = getActivity().getLayoutInflater().
                inflate(R.layout.header_menu, listView, false);
        listView.addHeaderView(header, null, false);
        listView.setAdapter(mMenuAdapter);

        mCallbacks = (NavigationCallbacks) getActivity();
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        MenuItems item = mMenuAdapter.getItem((int)id); // because has header
        mCallbacks.direction(item);
    }
}
