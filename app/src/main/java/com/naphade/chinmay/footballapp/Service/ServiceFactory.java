package com.naphade.chinmay.footballapp.Service;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceFactory {

    public static <T> T createRetrofitService(final Class<T> clazz) {
        final Retrofit restAdapter = new Retrofit.Builder()
                .baseUrl("http://api.football-data.org/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();


        return restAdapter.create(clazz);
    }
}
