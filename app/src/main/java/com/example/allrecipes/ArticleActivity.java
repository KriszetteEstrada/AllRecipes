package com.example.allrecipes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

public class ArticleActivity extends AppCompatActivity{
    ImageView url;
    TextView name;
    TextView cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);

        Intent intent = getIntent();
        String t = intent.getStringExtra("title");
        String c = intent.getStringExtra("cont");
        String u = intent.getStringExtra("img");

        url = findViewById(R.id.url);
        name = findViewById(R.id.title);
        cont =  findViewById(R.id.content);

        Picasso.get().load(u).into(url);
        name.setText(t);
        cont.setText(c);
    }
}
