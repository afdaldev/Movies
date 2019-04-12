package com.example.movies.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.bumptech.glide.request.transition.Transition;
import com.example.movies.DetailActivity;
import com.example.movies.R;
import com.example.movies.databinding.ListMovieItemBinding;
import com.example.movies.model.Movie;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.palette.graphics.Palette;
import androidx.recyclerview.widget.RecyclerView;

import static com.example.movies.model.Movie.*;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private static final String POSTER_BASE_URL = "https://image.tmdb.org/t/p/w185";
    private List<ResultsBean> movies;
    private Context context;

    public MovieAdapter(List<ResultsBean> movies, Context context) {
        this.movies = movies;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_movie_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        ResultsBean movie = movies.get(position);

        holder.listMovieItemBinding.tvMovieTitle.setText(movie.getTitle());

        Glide.with(context)
                .asBitmap()
                .load(POSTER_BASE_URL + movie.getPosterPath())
                .into(new BitmapImageViewTarget(holder.listMovieItemBinding.imgMoviePoster){
                    @Override
                    public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
                        super.onResourceReady(resource, transition);

                        Palette.from(resource).generate(new Palette.PaletteAsyncListener() {
                            @Override
                            public void onGenerated(@Nullable Palette palette) {
                                holder.listMovieItemBinding.movieTitleBackground.setBackgroundColor(
                                        palette.getDominantColor(context.getResources().getColor(android.R.color.darker_gray)));
                            }
                        });
                    }
                });
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ListMovieItemBinding listMovieItemBinding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            listMovieItemBinding = DataBindingUtil.bind(itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Movie.ResultsBean movie = movies.get(position);

            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("movie", movie);
            context.startActivity(intent);
        }
    }
}
