package ksb36.kent.ac.androidminiproject.network;

import retrofit2.Retrofit;

public class ArticleRepository {
    private Retrofit retrofit;
    private ArticleService articleService;
    private static final ArticleRepository ourInstance = new ArticleRepository();

    public static ArticleRepository getInstance() {
        return ourInstance;
    }

    private ArticleRepository() {
    }
}
