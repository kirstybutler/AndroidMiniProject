package ksb36.kent.ac.androidminiproject.network;

import java.util.List;

import ksb36.kent.ac.androidminiproject.model.Article;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ArticleService {

    static final String BASE_URL = "http://www.ubicomp-kent.info/projects/newsfeed/";

    @GET("articles.cgi")
    Call<List<Article>> getAllArticles();

}

