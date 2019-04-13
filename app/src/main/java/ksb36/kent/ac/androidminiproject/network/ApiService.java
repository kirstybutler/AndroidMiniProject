package ksb36.kent.ac.androidminiproject.network;


import java.util.List;

import ksb36.kent.ac.androidminiproject.model.Articles;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    //static final String BASE_URL = "http://www.ubicomp-kent.org/projects/newsfeed/articles.cgi";
    // Could give a generic url and for @GET give extension

    @GET("articles.cgi")
    Call<List<Articles>> getArticles();

}

