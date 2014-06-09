package com.gundf.fertighaus.adpters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.gundf.fertighaus.R;
import com.gundf.fertighaus.enumerable.MenuItems;

public class MenuAdapter extends BaseAdapter {

    private MenuItems[] mItems;
    private LayoutInflater mInflater;

    public MenuAdapter(Context context) {
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mItems = MenuItems.values();
    }

    @Override
    public int getCount() {
        return mItems.length;
    }

    @Override
    public MenuItems getItem(int position) {
        return mItems[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item_menu, parent, false);
            holder = new ViewHolder();
            holder.label = (TextView) convertView.findViewById(R.id.label_menu_item);
            holder.image = (ImageView) convertView.findViewById(R.id.menu_image);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.label.setText(mItems[position].getIdLabel());
        holder.image.setImageResource(mItems[position].getIdImage());
        return convertView;
    }

    private class ViewHolder {
        ImageView image;
        TextView label;
    }
}
