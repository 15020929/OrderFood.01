package com.example.xuan.orderfood.Interface;

import android.view.View;

/**
 * Created by xuan on 30/01/2018.
 */
//We net click to Recycler View item -> start new activity with details of menu, so need implement Onclick and ViewHolder to push it
public interface ItemCLickListener {
    void onClick(View view, int position, boolean isLongCLick);
}
