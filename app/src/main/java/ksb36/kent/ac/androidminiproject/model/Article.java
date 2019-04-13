package ksb36.kent.ac.androidminiproject.model;

import android.view.View;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.sql.Timestamp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Article {

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("imageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("dateTime")
    @Expose
    private String dateTime;
    @SerializedName("articleUrl")
    @Expose
    private String articleUrl;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

}