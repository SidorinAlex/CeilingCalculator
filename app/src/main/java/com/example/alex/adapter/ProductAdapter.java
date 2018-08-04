package com.example.alex.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import com.example.alex.activity.R;
import com.example.alex.product.Product;

import java.util.ArrayList;

/**
 * Created by SidorinAlex on 20.05.2018.
 */

public class ProductAdapter extends BaseAdapter {
    private ArrayList<Product> list;
    private LayoutInflater layoutInflater;

    public ProductAdapter(Context context, ArrayList<Product> list) {
        this.list = list;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = layoutInflater.inflate(R.layout.item_layout, parent, false);
        }

        Product product = getProduct(position);

        Button productText = (Button) view.findViewById(R.id.showProductText);

        String text = product.getName() + " " + product.getQuantity() + " "
                + product.getUnits() + " стоимость равна " + product.getTotalPrice();

        productText.setText(text);
        return view;
    }


    private Product getProduct(int position) {
        ;
        return (Product) getItem(position);
    }
}
