package com.example.alex.activity;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alex.product.Product;

import java.util.ArrayList;

public class ListViewActivity extends ListActivity {


    final Context context = this;
    ArrayList<Product> products;
    String address;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        Intent mIntent = getIntent();

        products = (ArrayList<Product>) mIntent.getSerializableExtra("ThisRoom");
//       for(int i = 0; i<products.size(); i++){
//            products.get(i).setTextColor((Texture) mIntent.getSerializableExtra("Texture"+i));
//        }

        address = (String)mIntent.getSerializableExtra("address");
        ListView list = (ListView) findViewById(android.R.id.list);


        final ArrayAdapter<Product> adapter = new ArrayAdapter<Product>(this,
                android.R.layout.simple_list_item_1, products);

        list.setAdapter(adapter);

        for (Product p :
                products) {
            Log.v("отл Текстура list", "" + p.getTexture());
        }


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                AlertDialog.Builder adb = new AlertDialog.Builder(ListViewActivity.this);
                adb.setTitle("Изменение количества продукта ");
                adb.setMessage("Введите новое значение количества для продукта " + products.get(position).getName());

                LayoutInflater li = LayoutInflater.from(ListViewActivity.this);
                final View promptsView = li.inflate(R.layout.prompts, null);
                adb.setView(promptsView);

                final EditText input = (EditText) promptsView.findViewById(R.id.editTextDialogUserInput);
                adb.setCancelable(false);


                final int positionToSet = position;
                adb.setNegativeButton("Отмена", null);
                adb.setPositiveButton("Изменить", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        float quantity = Float.parseFloat(input.getText().toString());
                        products.get(positionToSet).setQuantity(quantity);
                        adapter.notifyDataSetChanged();
                        calculateTheTotalCost(products);
                    }
                });
                adb.show();
            }
        });

        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                AlertDialog.Builder adb = new AlertDialog.Builder(ListViewActivity.this);
                adb.setTitle("Удалить?");
                adb.setMessage("Вы действительно хотите удалить продукт " + products.get(position).getName());
                final int positionToRemove = position;
                adb.setNegativeButton("Отмена", null);
                adb.setPositiveButton("Да", new AlertDialog.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        products.remove(positionToRemove);
                        adapter.notifyDataSetChanged();
                        calculateTheTotalCost(products);
                    }
                });
                adb.show();
                return true;
            }
        });

        calculateTheTotalCost(products);


    }

    private void calculateTheTotalCost(ArrayList<Product> products) {
        int totalCoast = 0;

        for (Product s : products) {
            totalCoast += s.getTotalPrice();

        }

        // String textPrise = showTextPrise();

        if (totalCoast<4500){
            totalCoast=4500;
        }

        String message;
        if(address !=null){
            message = address +"\nОбщая стоимость" + " " + totalCoast + "\n";
        }
        else {
            message = "Общая стоимость" + " " + totalCoast + "\n";
        }
        displayTotalPrise(message);
    }

    public void backToMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("listRoom", products);
        setResult(RESULT_OK, intent);
        finish();
    }


    public void displayTotalPrise(String message) {
        TextView totalCoast = (TextView) findViewById(R.id.totalPrise);
        totalCoast.setText(message);
    }

    public void showPrise(View view) {
        float materialCoast = 0;
        int coastOfWork = 0;
        int coastPrise;
        int coast1;
        int coast2;
        int coast3;
        int coast4;

        for (Product s : products) {
            coastOfWork += (s.getCoastOfWork() * s.getQuantity());
            Log.v("стоимость", "стоимость работы равна " + coastOfWork);
            materialCoast += (s.getMaterialCoast() * s.getQuantity());
            Log.v("стоимость", "стоимость материалов равна " + materialCoast);
        }

        if (coastOfWork < 1500) {
            coastOfWork = 1500;
            Log.v("стоимость", "стоимость работы равна " + coastOfWork);
        }

        coastPrise = (int) materialCoast + coastOfWork;

        Log.v("стоимость", "общая себестоимость  равна " + coastPrise);
        coast1 = (int) (coastPrise / 0.39);
        coast2 = (int) (coastPrise / 0.44);
        coast3 = (int) (coastPrise / 0.49);
        coast4 = (int) (coastPrise / 0.59);
        Toast toast = Toast.makeText(this, coast1 + "(39)\n" + coast2 + "(44)\n" + coast3 + "(49)\n" + coast4 + "(59)\n" + coastPrise, Toast.LENGTH_LONG);
        toast.show();
    }

}
