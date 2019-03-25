package ksb36.kent.ac.androidminiproject.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import ksb36.kent.ac.androidminiproject.R;
import ksb36.kent.ac.androidminiproject.model.Article;

public class NewsFeedAdapter extends RecyclerView.Adapter<NewsFeedAdapter.viewHolder> {
    private List<Article> list = new ArrayList<>();

    NewsFeedAdapter(List<Article> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_view, viewGroup, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(viewHolder viewHolder, int i) {
        viewHolder.Desc.setText(list.get(i).getDescription());
        viewHolder.Author.setText(list.get(i).getAuthor());
        viewHolder.Date.setText((CharSequence) list.get(i).getDateTime());
        viewHolder.Title.setText(list.get(i).getTitle());
        viewHolder.URL.setText(list.get(i).getArticleURL());
        Picasso.get()
                .load(list.get(i).getImageURL())
                .into(viewHolder.Image);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder {

        TextView Desc, Author, Title, Date, URL;
        ImageView Image;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            Desc = (TextView) itemView.findViewById(R.id.desc);
            Author = (TextView) itemView.findViewById(R.id.author);
            Title = (TextView) itemView.findViewById(R.id.title);
            Date = (TextView) itemView.findViewById(R.id.date);
            URL = (TextView) itemView.findViewById(R.id.url);
            Image = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
