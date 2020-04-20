package com.koushik.simplemvp.main;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.koushik.simplemvp.R;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {


    private List<ItemModel> items;
    private Listener listener;

    public MainAdapter(List<ItemModel> items, Listener listener) {
        this.items = items;
        this.listener = listener;
    }

    interface Listener {
        void onItemClicked(String item);
    }


    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextView v = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.view_main_item, parent, false);
        return new MainViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        final String item = items.get(position).getItemName();
        holder.textView.setText(item);
        holder.textView.setOnClickListener(v -> listener.onItemClicked(item));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class MainViewHolder extends RecyclerView.ViewHolder {

        TextView textView;

        MainViewHolder(TextView textView) {
            super(textView);
            this.textView = textView;
        }
    }
}
