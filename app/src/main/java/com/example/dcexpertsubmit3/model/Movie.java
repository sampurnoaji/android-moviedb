package com.example.dcexpertsubmit3.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Dibuat oleh petersam
 */
public class Movie implements Parcelable {
    private int id;
    private String title;
    private String release_date;
    private String overview;
    private String poster_path;
    private String original_language;
    private double vote_average;
    private double popularity;

    public Movie() {
    }

    protected Movie(Parcel in) {
        id = in.readInt();
        title = in.readString();
        release_date = in.readString();
        overview = in.readString();
        poster_path = in.readString();
        original_language = in.readString();
        vote_average = in.readDouble();
        popularity = in.readDouble();
    }

    public static final Creator<Movie> CREATOR = new Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel in) {
            return new Movie(in);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public double getVote_average() {
        return vote_average;
    }

    public void setVote_average(double vote_average) {
        this.vote_average = vote_average;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(title);
        parcel.writeString(release_date);
        parcel.writeString(overview);
        parcel.writeString(poster_path);
        parcel.writeString(original_language);
        parcel.writeDouble(vote_average);
        parcel.writeDouble(popularity);
    }
}