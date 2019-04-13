package ksb36.kent.ac.androidminiproject.ui;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ksb36.kent.ac.androidminiproject.R;
import ksb36.kent.ac.androidminiproject.model.Article;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyHolder> {

        List<Article> list;

        public RecyclerAdapter(List<Article> list) {
            this.list = list;
        }

        @Override
        public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_view, parent, false);

            MyHolder myHolder = new MyHolder(view);
            return myHolder;
        }

        @Override
        public void onBindViewHolder(MyHolder holder, int position) {
            Article article = list.get(position);
            holder.Description.setText(list.get(position).getDescription());
            holder.Author.setText(list.get(position).getAuthor());
            holder.Title.setText(list.get(position).getTitle());
            holder.DateTime.setText(list.get(position).getDateTime());
            holder.ArticleURL.setText(list.get(position).getArticleUrl());
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        public class MyHolder extends RecyclerView.ViewHolder {
            public TextView Description, Author, Title, DateTime, ArticleURL;

            public MyHolder(View itemView) {
                super(itemView);
                Description = (TextView) itemView.findViewById(R.id.desc);
                Author = (TextView) itemView.findViewById(R.id.author);
                Title = (TextView) itemView.findViewById(R.id.title);
                DateTime = (TextView) itemView.findViewById(R.id.date);
                ArticleURL = (TextView) itemView.findViewById(R.id.url);

            }
        }
    }