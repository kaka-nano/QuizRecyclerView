package com.example.quizrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.TextView;

import com.example.quizrecyclerview.PojoClass.ProductModel;
import com.example.quizrecyclerview.adapter.ProductAdapter;

import java.util.ArrayList;


public class RecyclerView extends AppCompatActivity {


    //declare the element to display text
    TextView textName;
    //create a variable that will store the information i am receiving
    String nameOfUser;
    //referencing recyclerview
    private androidx.recyclerview.widget.RecyclerView RecyclerView;
    //referencing adapter
    private androidx.recyclerview.widget.RecyclerView.Adapter Adapter;
    //layout manager
    private androidx.recyclerview.widget.RecyclerView.LayoutManager LayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);


// reference the recyclerview
        RecyclerView = findViewById(R.id.RecyclerNewProduct);

        //here we set up our list
        ArrayList<ProductModel> ProductModels = new ArrayList<>();
        ProductModels.add(new ProductModel(R.drawable.ic_bluetooth_24, "BluetoothIcon", "Used for connecting phone"));
        ProductModels.add(new ProductModel(R.drawable.ic_alarms_24, "Alarm", "Wake Up ans start to code"));
        ProductModels.add(new ProductModel(R.drawable.ic_rotation_24, "Rotation", "Rotate easily and carefully"));
        ProductModels.add(new ProductModel(R.drawable.ic_photo_24, "Picture", "Get Some Selfies for your self"));
        ProductModels.add(new ProductModel(R.drawable.ic_battery, "Battery ", "Low Battery look for your charger"));
        ProductModels.add(new ProductModel(R.drawable.ic_rotation_24, "Hisense", "Android Smart TV"));


// here we populate the recycler view
        RecyclerView.setHasFixedSize(true); //use size set recylerview according to the item
        LayoutManager = new LinearLayoutManager(this); // inititalising the layout manager
        Adapter = new ProductAdapter(this,ProductModels);
        RecyclerView.setLayoutManager(LayoutManager);
        RecyclerView.setAdapter(Adapter);


    }
}