package ksb36.kent.ac.androidminiproject.model;

import com.google.gson.annotations.Expose;
import java.sql.Timestamp;

public class Article {
    @Expose
    private String description;
    @Expose
    private String author;
    @Expose
    private String imageURL;
    @Expose
    private String title;
    @Expose
    private Timestamp dateTime;
    @Expose
    private String articleURL;

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

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public String getArticleURL() {
        return articleURL;
    }

    public void setArticleURL(String articleURL) {
        this.articleURL = articleURL;
    }

    public Article(String description, String author, String imageURL, String title, Timestamp dateTime, String articleURL) {
        this.description = description;
        this.author = author;
        this.imageURL = imageURL;
        this.title = title;
        this.dateTime = dateTime;
        this.articleURL = articleURL;
    }

}
