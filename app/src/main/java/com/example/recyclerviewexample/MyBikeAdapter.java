package com.example.recyclerviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyBikeAdapter extends RecyclerView.Adapter<MyBikeAdapter.ViewHolder> {

    MyBikeData[] myBikeData;
    Context context;

    public MyBikeAdapter(MyBikeData[] myBikeData, MainActivity activity) {
        this.myBikeData = myBikeData;
        this.context = activity;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.bike_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MyBikeData myBikeDataList = myBikeData[position];
        holder.textViewName.setText(myBikeDataList.getBikeName());
        holder.textViewPrice.setText(myBikeDataList.getBikePrice());
        holder.bikeImage.setImageResource(myBikeDataList.getBikeImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,  myBikeDataList.getBikeName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return myBikeData.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView bikeImage;
        TextView textViewName;
        TextView textViewPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            bikeImage = itemView.findViewById(R.id.imageview);
            textViewName = itemView.findViewById(R.id.textName);
            textViewPrice = itemView.findViewById(R.id.textPrice);


        }
    }
}
