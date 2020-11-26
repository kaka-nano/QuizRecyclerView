package com.example.quizrecyclerview.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quizrecyclerview.PojoClass.ProductModel;
import com.example.quizrecyclerview.ProductDetails;
import com.example.quizrecyclerview.R;

import java.util.ArrayList;

import static android.widget.Toast.*;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {
    // create a reference to the product model,
    // create an array, which is a storage to for the list of products
    private ArrayList<ProductModel> productModels;
    private Context mCtx;

   // public ProductAdapter(ArrayList<ProductModel> productModels) { }

    // empty constructor for the array list
    public ProductAdapter(Context context,ArrayList<ProductModel> ProductModelArrayList ) {
        productModels = ProductModelArrayList;
        mCtx=context;
    }
        //create my view holder subclass
        static class ProductViewHolder extends RecyclerView.ViewHolder {
            //declare the elements

             TextView name;
             TextView description;
             ImageView imageProduct;
             RelativeLayout productClick;

            public ProductViewHolder(@NonNull View itemView) {
                super(itemView);
                //fetch / find / reference // refer them to their Ids in the layout
                name = itemView.findViewById(R.id.name);
                description = itemView.findViewById(R.id.description);
                imageProduct = itemView.findViewById(R.id.imageProduct);
                productClick = itemView.findViewById(R.id.productClick);

            }


        }


        @Override
        // inflate our recycled layout
        public ProductAdapter.ProductViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.exemple_item, parent, false);
            ProductAdapter.ProductViewHolder evh = new ProductViewHolder(v); //new instance
            return evh;
        }

        @Override

        // here is where the data will be set and the click listeners implementation
        public void onBindViewHolder (ProductViewHolder holder,int position){

            ProductModel ProductModelList = productModels.get(position);

            //set data
            holder.name.setText(ProductModelList.getProductName()); //name
            holder.description.setText(ProductModelList.getProductDescription()); //product
            holder.imageProduct.setImageResource(ProductModelList.getImageResource()); //image

            // Here i will set the rela click ID and the intent for the click listeners
            // to take the user to the next screen with details of the product
           holder.productClick.setOnClickListener((v)-> {

                // launch the intent (From, to) in the brackets
                    Intent MyIntent = new Intent(mCtx, ProductDetails.class);
                    MyIntent.putExtra("productName", productModels.get(position).getProductName()); // name
                    MyIntent.putExtra("productDescription", productModels.get(position).getProductDescription()); // description
                    MyIntent.putExtra("productImage", productModels.get(position).getImageResource()); // image

                    mCtx.startActivity(MyIntent);

            });

        }

    @Override

    //Recycling size
    public int getItemCount() { return productModels.size(); }

    }





