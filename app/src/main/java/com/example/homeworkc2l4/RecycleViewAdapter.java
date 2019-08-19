package com.example.homeworkc2l4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>{

    private ArrayList<String> mNameFood = new ArrayList<>();
    private ArrayList<String> mDescriptionFood = new ArrayList<>();
    private ArrayList<String> mImage = new ArrayList<>();
    private ArrayList<String> mPrice = new ArrayList<>();
    private Context mContext;

    public RecycleViewAdapter(ArrayList<String> mNameFood, ArrayList<String> mImage, ArrayList<String> mDescriptionFood, ArrayList<String> mPrice, Context mContext) {
        this.mNameFood = mNameFood;
        this.mImage = mImage;
        this.mContext = mContext;
        this.mDescriptionFood = mDescriptionFood;
        this.mPrice = mPrice;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(mContext)
            .asBitmap()
                .load(mImage.get(position))
                .into(holder.imageFood);
        holder.textNameFood.setText(mNameFood.get(position));
        holder.textDescriptionFood.setText(mDescriptionFood.get(position));
        holder.parrentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, mPrice.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mNameFood.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imageFood;
        TextView textNameFood;
        TextView textDescriptionFood;
        LinearLayout parrentLayout;

        public ViewHolder (View itemView) {
            super(itemView);
            imageFood = itemView.findViewById(R.id.image_food);
            textNameFood = itemView.findViewById(R.id.text_name_food);
            textDescriptionFood = itemView.findViewById(R.id.text_description_food);
            parrentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }

}
