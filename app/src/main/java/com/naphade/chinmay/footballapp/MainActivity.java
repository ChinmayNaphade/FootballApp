package com.naphade.chinmay.footballapp;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.View;

import com.naphade.chinmay.footballapp.Model.SoccerSeason;
import com.naphade.chinmay.footballapp.Service.FootballService;
import com.naphade.chinmay.footballapp.Service.ServiceFactory;
import com.naphade.chinmay.footballapp.adapter.CardAdapter;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {
    private String TAG = "MainActivity";
    CardAdapter mCardAdapter;

    @Bind(R.id.recycler_view)
    RecyclerView mRecyclerView;

    @Bind(R.id.coordinator)
    CoordinatorLayout layout;



    @OnClick(R.id.fab)
    public void onClick(View view) {
        mCardAdapter.clear();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        /**
         * Set up Android CardView/RecycleView
         */
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        mCardAdapter = new CardAdapter();
        mRecyclerView.setAdapter(mCardAdapter);

        FootballService service = ServiceFactory.createRetrofitService(FootballService.class);
        rx.Observable<List<SoccerSeason>> season = service.getSeasons("2015");
        season.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<List<SoccerSeason>>() {
                    @Override
                    public void onCompleted() {
                        Log.e(TAG, "onCompleted: ");
                        Snackbar.make(layout, "It works", Snackbar.LENGTH_LONG)
                                .show();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, "onError: ");
                    }

                    @Override
                    public void onNext(List<SoccerSeason> soccerSeasons) {
                        Log.e(TAG, "onNext: ");
                        mCardAdapter.addAll(soccerSeasons);
                    }
                });

    }


}

