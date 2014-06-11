package com.gundf.fertighaus.adpters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.gundf.fertighaus.R;
import com.gundf.fertighaus.models.news.NewsItemContent;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

public class NewsAdapter extends BaseAdapter {

    private DisplayImageOptions mDisplayImageOptions;

    private List<NewsItemContent> mItems;
    private LayoutInflater mInflater;

    public NewsAdapter(Context context, List<NewsItemContent> items) {
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mItems = items;
        mDisplayImageOptions = createDisplayImageOption();
    }

    private DisplayImageOptions createDisplayImageOption() {
        return new DisplayImageOptions.Builder()
                .showImageOnLoading(R.drawable.ic_launcher) //TODO
                .showImageForEmptyUri(R.drawable.ic_launcher) //TODO
                .cacheInMemory(true)
                .build();
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public NewsItemContent getItem(int position) {
        return mItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item_news, parent, false);
            convertView.setTag(createHolder(convertView));
        }
        bindInfo((ViewHolder) convertView.getTag(), getItem(position));
        return convertView;
    }

    private void bindInfo(ViewHolder holder, NewsItemContent item) {
        holder.label.setText(item.getHeadLine());
        ImageLoader.getInstance().displayImage(item.getPicture().getMedium(), holder.image, mDisplayImageOptions);
    }

    private ViewHolder createHolder(View v) {
        ViewHolder holder = new ViewHolder();
        holder.label = (TextView) v.findViewById(R.id.label_news);
        holder.image = (ImageView) v.findViewById(R.id.image_news);
        return holder;
    }

    private class ViewHolder {
        ImageView image;
        TextView label;
    }
}
