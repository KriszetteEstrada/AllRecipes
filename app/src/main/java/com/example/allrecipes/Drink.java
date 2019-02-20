package com.example.allrecipes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;

public class Drink extends AppCompatActivity implements View.OnClickListener {
    ImageView drinkImage;
    TextView drinkName;
    TextView drinkDesc;
    TextView ing;
    TextView drinkIng;
    TextView ins;
    TextView drinkIns;
    TextView rat;
    TextView drinkRating;
    Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String desc = intent.getStringExtra("desc");
        String ingre = intent.getStringExtra("ing");
        String inst = intent.getStringExtra("ins");
        String rating = intent.getStringExtra("rat");
        String img = intent.getStringExtra("img");


        drinkImage = findViewById(R.id.drinkImage);
        drinkName = findViewById(R.id.drinkName);
        drinkDesc =  findViewById(R.id.drinkDesc);
        ing =  findViewById(R.id.ing);
        drinkIng = findViewById(R.id.drinkIng);
        ins = findViewById(R.id.ins);
        drinkIns = findViewById(R.id.drinkIns);
        rat = findViewById(R.id.rat);
        drinkRating =  findViewById(R.id.drinkRating);
        home =  findViewById(R.id.home);

            Picasso.get().load(img).into(drinkImage);
            drinkName.setText(name);
            drinkDesc.setText(desc);
            drinkIng.setText(ingre);
            drinkIns.setText(inst);
            drinkRating.setText(rating);

            home.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(getApplicationContext(),Home.class);
        startActivity(i);
        setContentView(R.layout.activity_home);
    }
}
