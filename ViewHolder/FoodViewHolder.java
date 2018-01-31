package com.example.xuan.orderfood.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.xuan.orderfood.Interface.ItemCLickListener;
import com.example.xuan.orderfood.R;

/**
 * Created by Admin on 31-01-18.
 */

public class FoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView food_name;
    public ImageView food_image;

    public ItemCLickListener itemCLickListener;
    public FoodViewHolder (View itemView) {
        super(itemView);

        food_name = (TextView)itemView.findViewById(R.id.food_name);
        food_image = (ImageView)itemView.findViewById(R.id.food_image);

        itemView.setOnClickListener(this);
    }

    public void setItemCLickListener(ItemCLickListener itemCLickListener) {
        this.itemCLickListener = itemCLickListener;
    }

    @Override
    public void onClick(View view) {
        itemCLickListener.onClick(view, getAdapterPosition(), false);
    }
}
