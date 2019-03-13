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

}
