package com.example.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    private TextView myTextView;
    public RecyclerViewHolder(final View view) {
        super(view);
        myTextView =(TextView)view.findViewById(R.id.simple_text);
    }

    public void bindData(final RecyclerViewModel viewModel) {
        myTextView.setText(viewModel.getSimpleText());
    }
}
