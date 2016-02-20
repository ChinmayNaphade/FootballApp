package com.naphade.chinmay.footballapp.Service;


import com.naphade.chinmay.footballapp.Model.SoccerSeason;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface FootballService {

    @GET("soccerseasons")
    Observable<List<SoccerSeason>> getSeasons(@Query("season") String season);

}
