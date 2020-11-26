package com.example.quizrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductDetails extends AppCompatActivity {
// declare elements a little different from the video
    TextView nameProduct, descriptionProduct;
    ImageView imageProduct;
// variable to hold shared information
    String namehold,descriptionhold,imagehold;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        //reference the product
        imageProduct = findViewById(R.id.img_Product);
        nameProduct = findViewById(R.id.name_txt);
        descriptionProduct = findViewById(R.id.description_txt);

        //using intent to fetch shared information from the previous class
        Intent intent = getIntent();
        namehold = intent.getStringExtra("productName");
        descriptionhold = intent.getStringExtra("productDescription");
        imagehold=intent.getStringExtra("productImage");

        // fetch image
        Bundle bundle=getIntent().getExtras();
        if (bundle != null){
            int resid =bundle.getInt("productImage");
            imageProduct.setImageResource(resid);
        }

        // set images and text, because data has to be displayed
//        imageProduct.setImageResource(Integer.parseInt(imagehold));  // Code ya kufa iyo imehomba
        nameProduct.setText(namehold);
        descriptionProduct.setText(descriptionhold);


    }

    public void exit (View v){
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }

}