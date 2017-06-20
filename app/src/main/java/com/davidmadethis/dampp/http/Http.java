package com.davidmadethis.dampp.http;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by root on 6/20/17.
 */

public class Http {
    public static final String API_URL = "http://172.30.15.119/api/v1/";

    public Http(){

    }


    public Call<Object> login(String json) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        DamppService api = retrofit.create(DamppService.class);
        return api.login(json);

    }


}
