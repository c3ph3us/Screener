package com.mikepenz.fastadapter.utils;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;

public interface ViewHolderFactory<T extends ViewHolder> {
    T create(View view);
}
