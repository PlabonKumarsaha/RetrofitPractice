package com.example.retrofitpractice.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.retrofitpractice.Model.Products;
import com.example.retrofitpractice.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ProductRecyclerAdapter extends RecyclerView.Adapter<ProductRecyclerAdapter.ProductViewHolder> {

    private List<Products>productsList;
    Context context;

    public ProductRecyclerAdapter(List<Products> productsList, Context context) {
        this.productsList = productsList;
        this.context = context;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.recyler_row_item,parent,false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

        holder.name.setText(productsList.get(position).getName());
        holder.price.setText(productsList.get(position).getPrice());
        holder.qnty.setText(productsList.get(position).getQuanity());
        holder.unit.setText(productsList.get(position).getUnit());

        Glide.with(context)
               .load(productsList.get(position).getImageURL()).into(holder.prodImage);

       // Picasso.get()
         //       .load(productsList.get(position).getImageURL())
           //     .into(holder.prodImage);



    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }


    static class ProductViewHolder extends RecyclerView.ViewHolder{

        ImageView prodImage;
        TextView name,price,qnty,unit;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            prodImage = itemView.findViewById(R.id.imageView2);
            name = itemView.findViewById(R.id.name);
            price = itemView.findViewById(R.id.price);
            qnty = itemView.findViewById(R.id.quantity);
            unit = itemView.findViewById(R.id.unit);
        }
    }
}
