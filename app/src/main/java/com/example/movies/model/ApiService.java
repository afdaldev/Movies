package com.example.movies.model;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiService {

    public static final String BAS_URL = "https://api.themoviedb.org/3/";

    public static APIEndPoint getAPI(){
        final Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BAS_URL)
                .build();
        return retrofit.create(APIEndPoint.class);
    }

}
