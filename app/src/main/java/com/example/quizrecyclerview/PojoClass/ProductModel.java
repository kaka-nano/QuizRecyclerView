package com.example.quizrecyclerview.PojoClass;

public class ProductModel {

    // Declaring variables for
    private int imageResource;
    private String productName;
    private String productDescription;


    // constructors
    public ProductModel(int image, String name, String Description){
        productName = name;
        productDescription = Description;
        imageResource = image;
    }
        // getters and setters


    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

}



