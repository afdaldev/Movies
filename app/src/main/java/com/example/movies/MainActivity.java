package com.example.movies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.movies.adapter.MovieAdapter;
import com.example.movies.databinding.ActivityMainBinding;
import com.example.movies.model.Movie;
import com.example.movies.model.MovieService;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private MovieAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        activityMainBinding.rvMovies.setLayoutManager(gridLayoutManager);
        activityMainBinding.pbMovies.setVisibility(View.VISIBLE);
        getMovies();

    }

    private void getMovies(){
        MovieService.getAPI().getMovies("e88b2c06ed7e7674f2f912d812290a70")
                .enqueue(new Callback<Movie>() {
                    @Override
                    public void onResponse(Call<Movie> call, Response<Movie> response) {
                        if (response.isSuccessful()){
                            activityMainBinding.pbMovies.setVisibility(View.INVISIBLE);
                            List<Movie.ResultsBean> movies = response.body().getResults();
                            adapter = new MovieAdapter(movies, MainActivity.this);
                            activityMainBinding.rvMovies.setAdapter(adapter);
                            for (Movie.ResultsBean resultsBean: movies){
                                resultsBean.getTitle();
                                resultsBean.getOriginalTitle();
                                Log.d("Judul Movies", resultsBean.getTitle() + resultsBean.getOriginalTitle());
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<Movie> call, Throwable t) {

                    }
                });
    }
}
