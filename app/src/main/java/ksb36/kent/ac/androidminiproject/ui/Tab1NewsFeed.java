package ksb36.kent.ac.androidminiproject.ui;

import android.app.ProgressDialog;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ksb36.kent.ac.androidminiproject.R;
import ksb36.kent.ac.androidminiproject.model.Article;
import ksb36.kent.ac.androidminiproject.model.Articles;
import ksb36.kent.ac.androidminiproject.network.ApiService;
import ksb36.kent.ac.androidminiproject.network.RetroClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Tab1NewsFeed extends Fragment {

    private RecyclerView recyclerView;
    private List<Article> listing;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab1_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //init components

        recyclerView = (RecyclerView) view.findViewById(R.id.newsRecycler);
        listing = new ArrayList<>();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.ubicomp-kent.org/projects/newsfeed/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService service = retrofit.create(ApiService.class);
                    Call<List<Articles>> call = service.getArticles();
                    call.enqueue(new Callback<List<Articles>>() {
                        @Override
                        public void onResponse(Call<List<Articles>> call, Response<List<Articles>> response) {
                                List<Articles> list = response.body();
                                Articles articles = null;
                                for (int i = 0; i<list.size(); i++) {
                                    articles = new Articles();
                                    String category = list.get(i).getCategory();
                                    Integer page = list.get(i).getPage();
                                    Integer year = list.get(i).getYear();
                                    articles.setCategory(category);
                                    articles.setPage(page);
                                    articles.setYear(year);
                                }

                                RecyclerAdapter recyclerAdapter = new RecyclerAdapter(listing);
                                RecyclerView.LayoutManager recyce = new LinearLayoutManager(getContext());
                                recyclerView.setLayoutManager(recyce);
                                recyclerView.setItemAnimator(new DefaultItemAnimator());
                                recyclerView.setAdapter(recyclerAdapter);
                        }

                        @Override
                        public void onFailure(Call<List<Articles>> call, Throwable t) {

                        }
                    });
    }
}