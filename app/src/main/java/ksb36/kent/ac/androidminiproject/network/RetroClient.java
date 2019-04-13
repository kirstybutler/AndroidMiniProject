package ksb36.kent.ac.androidminiproject.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroClient {

    private static final String ROOT_URL = "http://www.ubicomp-kent.org/projects/newsfeed/";


    private static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiService getApiService() {
        return getRetrofitInstance().create(ApiService.class);
    }
}
