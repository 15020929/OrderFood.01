package com.example.xuan.orderfood.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.xuan.orderfood.Interface.ItemCLickListener;
import com.example.xuan.orderfood.R;

/**
 * Created by xuan on 30/01/2018.
 */

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
{

    public TextView txtMenuName;
    public ImageView imageView;

    public ItemCLickListener itemCLickListener;

    public MenuViewHolder(View itemView) {
        super(itemView);

        txtMenuName = (TextView)itemView.findViewById(R.id.menu_name);
        imageView   = (ImageView) itemView.findViewById(R.id.menu_image);

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
