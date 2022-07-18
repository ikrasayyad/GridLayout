package com.example.gridlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter
{  private Context mContext;

    //constructor
    public  ImageAdapter(Context c) { mContext =c;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position){
        return null;
    }

    public long getItemId (int position){
        return 0;
    }

    //create a new ImageView for each item refrenced by the Adapter
    public View getView(int position, View convertview, ViewGroup parent) {
        ImageView imageView;

        if (convertview == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(185, 185));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertview;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }
    //keep all Images in array
    public  Integer[] mThumbIds={ R.drawable.iqra,R.drawable.iqra,
            R.drawable.iqra,R.drawable.iqra,
            R.drawable.iqra,R.drawable.iqra,
            R.drawable.iqra,R.drawable.iqra,
            R.drawable.iqra,R.drawable.iqra,
            R.drawable.iqra,R.drawable.iqra,

    };
}