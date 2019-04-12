package com.example.movies.model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIEndPoint {

    @GET("movie/now_playing")
    Call<Movie> getMovies(
            @Query("api_key") String apikey
    );
}
