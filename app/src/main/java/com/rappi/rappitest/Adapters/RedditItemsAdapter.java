package com.rappi.rappitest.Adapters;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.rappi.rappitest.Models.RedditData;

import java.util.ArrayList;

import ir.royapajoohesh.utils.Padding;

/**
 * Created by Dr TJ on February 2017.
 */

public class RedditItemsAdapter extends BaseAdapter {
    private static final String TAG = "RedditItemsAdapter";
    private ArrayList<RedditData> itemsList;
    private Context Context;
    private long selectedItemID = -1;

    public RedditItemsAdapter(Context context, ArrayList<RedditData> itemsList){
        this.Context = context;
        this.itemsList = itemsList;
    }

    @Override
    public int getCount() {
        return this.itemsList.size();
    }

    @Override
    public RedditData getItem(int position) {
        return (position < itemsList.size() && position >= 0) ? itemsList.get(position) : null;
    }

    @Override
    public long getItemId(int position) {
        return (position < itemsList.size() && position >= 0) ? itemsList.get(position).id : -1;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        RedditItemsAdapter.ViewHolder holder = null;

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this.Context.getSystemService(android.content.Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_layout, parent, false);

            holder = new RedditItemsAdapter.ViewHolder();
            holder.titleTextView = (TextView) convertView.findViewById(R.id.titleTextView);
            holder.iconImageView = (ImageView) convertView.findViewById(R.id.iconImageView);

            convertView.setTag(holder);
        } else {
            holder = (RedditItemsAdapter.ViewHolder) convertView.getTag();
        }

        RedditData tmpItem = getItem(position);
        holder.titleTextView.setText(tmpItem.label);

        if (itemsLayout == ViewType.Drawer) {
            Padding pd = Padding.getPadding(convertView);

            if (selectedItemID != -1 && tmpItem.id == selectedItemID) {
                convertView.setBackground(this.selectedItemBackground);
                holder.titleTextView.setTextColor(this.selectedItemTextColor);
            } else {
                convertView.setBackgroundColor(Color.TRANSPARENT);
                holder.titleTextView.setTextColor(this.itemTextColor);
            }

            pd.applyTo(convertView);
        }

        if (this.itemsLayout == ViewType.Grid) {
            if (holder.subTitleTextView == null)
                holder.subTitleTextView = (TextView) convertView.findViewById(R.id.subTitleTextView);

            String categorySubtitleText = tmpItem.AppsList.size() + " apps";
            holder.subTitleTextView.setText(categorySubtitleText);
        }

        holder.iconImageView.setImageDrawable(ContextCompat.getDrawable(Context, R.mipmap.icon));

        return convertView;
    }

    static class ViewHolder {
        TextView titleTextView;
        TextView subTitleTextView;
        ImageView iconImageView;

        public ViewHolder() {
            titleTextView = null;
            subTitleTextView = null;
            iconImageView = null;
        }
    }

}
