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

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> implements Serializable {

    private Context context;
    ArrayList<Recipe> recipes;

    public MyAdapter(Context c , ArrayList<Recipe> p)
    {
        context = c;
        recipes = p;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.cardview,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Recipe r = recipes.get(position);
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
        public TextView name,description, btn;
        public ImageView pic;

        public MyViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            description = itemView.findViewById(R.id.description);
            pic = itemView.findViewById(R.id.drinkPic);
            btn = itemView.findViewById(R.id.details);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View v) {
                    int position = getAdapterPosition();
                    Intent intent = new Intent(context, Drink.class);
                    intent.putExtra("img", recipes.get(position).getImage());
                    intent.putExtra("name", recipes.get(position).getName());
                    intent.putExtra("desc", recipes.get(position).getDescriptions());
                    intent.putExtra("ing", recipes.get(position).getIngredients());
                    intent.putExtra("ins", recipes.get(position).getInstructions());
                    intent.putExtra("rat", recipes.get(position).getRating());
                    context.startActivity(intent);

                }
            });
        }
    }
}