package com.example.alex.product;

import com.example.alex.product.baguette.AluminumBaguette;
import com.example.alex.product.baguette.AluminumBaguetteOnGlue;
import com.example.alex.product.baguette.AluminumSeparator;

import java.util.ArrayList;

public class PrintProductPrise {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new AluminumBaguette());
        products.add(new AluminumBaguetteOnGlue());
        products.add(new AluminumSeparator());


        for (Product s : products){
            System.out.println(s.getName() + " " + s.getCoastPrice());
        }
    }
}
