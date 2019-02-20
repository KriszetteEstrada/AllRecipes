package com.example.allrecipes;

import android.content.Context;
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

import java.util.ArrayList;

public class MixAdapter extends RecyclerView.Adapter<MixAdapter.MyViewHolder> {

    Context context;
    ArrayList<Recipe> recipes;

    public MixAdapter(Context c , ArrayList<Recipe> p)
    {
        context = c;
        recipes = p;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_drink,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(recipes.get(position).getName());
        holder.description.setText(recipes.get(position).getDescriptions());
        Picasso.get().load(recipes.get(position).getImage()).into(holder.pic);
    }

    @Override
    public int getItemCount() {
        return recipes.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView name,description, ingredient, instruction, rating;
        ImageView pic;

        public MyViewHolder(View itemView) {
            super(itemView);
         //   name = (TextView) itemView.findViewById(R.id.name);
         //   description = (TextView) itemView.findViewById(R.id.description);
        //    ingredient = (TextView) itemView.findViewById(R.id.ingredient);
          //  instruction = (TextView) itemView.findViewById(R.id.instruction);
         //   rating = (TextView) itemView.findViewById(R.id.rating);
          //  pic = (ImageView) itemView.findViewById(R.id.drinkPic);

        }
    }
}