package com.example.movies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.example.movies.databinding.ActivityDetailBinding;
import com.example.movies.databinding.ActivityMainBinding;
import com.example.movies.model.Movie;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDetailBinding activityDetailBinding = DataBindingUtil.setContentView(this, R.layout.activity_detail);

        Movie.ResultsBean resultsBean = getIntent().getParcelableExtra("movie");
        String BACKDROP_URL = "https://image.tmdb.org/t/p/w500";
        String POSTER_URL = "https://image.tmdb.org/t/p/w185";
        Glide.with(this)
                .load(BACKDROP_URL + resultsBean.getBackdropPath())
                .centerCrop()
                .into(activityDetailBinding.imgMovieBackdrop);
        Glide.with(this)
                .load(POSTER_URL + resultsBean.getPosterPath())
                .centerCrop()
                .into(activityDetailBinding.imgMoviePoster);
        activityDetailBinding.movieTitleSection.tvMovieTitle.setText(resultsBean.getTitle());
        activityDetailBinding.movieTitleSection.tvPopularity.setText(String.valueOf(resultsBean.getPopularity()));
        activityDetailBinding.movieTitleSection.tvReleaseDate.setText(resultsBean.getReleaseDate());
        activityDetailBinding.movieDetailSection.tvOverview.setText(resultsBean.getOverview());
    }
}
