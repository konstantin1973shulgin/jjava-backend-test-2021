package com.geekbrains.retrofit.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MiniMarketApiService {

    private MiniMarketApi api;

    public MiniMarketApiService(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:8189/market/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

         api = retrofit.create(MiniMarketApi.class);
    }

    public MiniMarketApi getApi() {
        return api;
    }
}
