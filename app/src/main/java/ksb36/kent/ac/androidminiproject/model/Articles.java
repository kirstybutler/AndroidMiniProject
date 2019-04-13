package ksb36.kent.ac.androidminiproject.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Articles {

    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("query")
    @Expose
    private String query;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("month")
    @Expose
    private Integer month;
    @SerializedName("day")
    @Expose
    private Integer day;
    @SerializedName("articles")
    @Expose
    private List<Article> articles = null;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

}