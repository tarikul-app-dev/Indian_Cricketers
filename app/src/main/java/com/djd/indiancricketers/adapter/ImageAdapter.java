package com.djd.indiancricketers.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageView;

import com.djd.indiancricketers.R;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    public ImageAdapter(Context c) {
            mContext = c;
        }
        public int getCount() {
            return thumbImages.length;
        }
        public Object getItem(int position) {
            return null;
        }
        public long getItemId(int position) {
            return 0;
        }
        // create a new ImageView for each item referenced by the Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(mContext);
            imageView.setLayoutParams(new Gallery.LayoutParams(200, 200));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
            imageView.setImageResource(thumbImages[position]);
            return imageView;
        }
        // Add all our images to arraylist
        public Integer[] thumbImages = {
                R.drawable.galary_1, R.drawable.galary_2,
                R.drawable.galary_3, R.drawable.galary_4,
                R.drawable.galary_5, R.drawable.galary_6,
                R.drawable.galary_7
        };
}
