package com.naphade.chinmay.footballapp.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.naphade.chinmay.footballapp.Model.SoccerSeason;
import com.naphade.chinmay.footballapp.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {
    List<SoccerSeason> mItems;

    public CardAdapter() {
        super();
        mItems = new ArrayList<>();
    }

    public void addData(SoccerSeason soccerSeason) {
        mItems.add(soccerSeason);
        notifyDataSetChanged();
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
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.recycler_view, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        SoccerSeason soccerSeason = mItems.get(i);
        viewHolder.caption.setText(soccerSeason.getCaption());
        viewHolder.league.setText(soccerSeason.getLeague());
        viewHolder.year.setText(soccerSeason.getYear());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.caption)
        TextView caption;

        @Bind(R.id.league)
        TextView league;

        @Bind(R.id.year)
         TextView year;

        public ViewHolder(View itemView) {
            super(itemView);
            /*caption = (TextView) itemView.findViewById(R.id.caption);
            league = (TextView) itemView.findViewById(R.id.league);
            year = (TextView) itemView.findViewById(R.id.year);*/
            ButterKnife.bind(this, itemView);
        }
    }
}