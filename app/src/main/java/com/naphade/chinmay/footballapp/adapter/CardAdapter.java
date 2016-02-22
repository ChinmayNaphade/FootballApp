package com.naphade.chinmay.footballapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.naphade.chinmay.footballapp.Model.SoccerSeason;
import com.naphade.chinmay.footballapp.databinding.RecyclerViewBinding;

import java.util.ArrayList;
import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {
    List<SoccerSeason> mItems;
    RecyclerViewBinding recyclerViewBinding;

    public CardAdapter() {
        super();
        mItems = new ArrayList<>();
    }

    public void addAll(List<SoccerSeason> list) {
        mItems = list;
        notifyDataSetChanged();
    }

    public void clear() {
        mItems.clear();
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        recyclerViewBinding = RecyclerViewBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        return new ViewHolder(recyclerViewBinding.getRoot());
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        recyclerViewBinding.setSeason(mItems.get(i));
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
            
        }
    }
}