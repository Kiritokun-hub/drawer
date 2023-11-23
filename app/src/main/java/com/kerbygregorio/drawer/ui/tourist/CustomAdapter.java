package com.kerbygregorio.drawer.ui.tourist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.kerbygregorio.drawer.R;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private String[] localDataSet;
    private Context context;

    public CustomAdapter(Context context, String[] dataSet) {
        this.context = context;
        localDataSet = dataSet;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.text_row_item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        viewHolder.getTextView().setText(localDataSet[position]);
        viewHolder.getImageView().setImageResource(getDrawableResourceId(position));
    }

    @Override
    public int getItemCount() {
        return localDataSet.length;
    }

    private int getDrawableResourceId(int position) {
        switch (position) {
            case 0:
                return R.drawable.lingayen;
            case 1:
                return R.drawable.manaoag;
            case 2:
                return R.drawable.cape;
            case 3:
                return R.drawable.our;
            case 4:
                return R.drawable.tayug;
            case 5:
                return R.drawable.balingasay;
            case 6:
                return R.drawable.tondol;
            case 7:
                return R.drawable.cave;
            case 8:
                return R.drawable.patar;
            case 9:
                return R.drawable.burgos;
            case 10:
                return R.drawable.hundred;

            // Add cases for other positions as needed
            default:
                return R.drawable.default_image;
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        private final ImageView imageView;

        public ViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.textView);
            imageView = view.findViewById(R.id.imageView);
        }

        public TextView getTextView() {
            return textView;
        }

        public ImageView getImageView() {
            return imageView;
        }
    }
}
