package com.gundf.fertighaus.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.gundf.fertighaus.R;
import com.gundf.fertighaus.adpters.NewsAdapter;
import com.gundf.fertighaus.models.news.NewsItemContent;

import java.util.List;

public class NewsFragment extends Fragment {

    private ListView mListView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, null);
        mListView = (ListView) view.findViewById(android.R.id.list);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        List<NewsItemContent> itemContentList = NewsItemContent.getTestList();
        NewsAdapter adapter = new NewsAdapter(getActivity(), itemContentList);
        mListView.setAdapter(adapter);
    }
}
