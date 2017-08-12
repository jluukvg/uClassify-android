package com.jluukvg.uclassify.ui.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by jluukvg on 8/12/17.
 *
 */

public abstract class BaseViewHolder extends RecyclerView.ViewHolder {

    private int currentPosition;

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    protected abstract void clear();

    public void onBind(int position) {
        this.currentPosition = position;
        clear();
    }

    public int getCurrentPosition() {
        return currentPosition;
    }
}
