package com.example.allrecipes;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

import java.io.Serializable;
import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> implements Serializable {

    private Context context;
    ArrayList<Article> articles;

    public HomeAdapter(Context c , ArrayList<Article> a)
    {
        context = c;
        articles = a;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.home_layout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Article a = articles.get(position);
        holder.title.setText(articles.get(position).getTitle());
        Picasso.get().load(articles.get(position).getUrl()).into(holder.url);
    }

    @Override
    public int getItemCount() {
        return articles.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        public TextView title, btn;
        public ImageView url;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            url = itemView.findViewById(R.id.thumbnail);

            url.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int position = getAdapterPosition();
                    Intent intent = new Intent(context, ArticleActivity.class);
                    intent.putExtra("img", articles.get(position).getUrl());
                    intent.putExtra("title", articles.get(position).getTitle());
                    intent.putExtra("cont", articles.get(position).getContent());
                    context.startActivity(intent);
                }
            });
        }
    }
}