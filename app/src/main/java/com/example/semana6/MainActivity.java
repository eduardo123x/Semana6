package com.example.semana6;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import android.os.Bundle;
import android.widget.ListView;

import com.example.semana6.adapters.ProductoAdapter;
import com.example.semana6.helpers.QueueUtils;
import com.example.semana6.models.Productos;

import java.util.Queue;

public class MainActivity extends AppCompatActivity {

    ListView productosList;
    ProductoAdapter productoAdapter;
    QueueUtils.QueueObject queue = null;
    ArrayList<Productos> items;
    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        queue = QueueUtils.getInstance(this.getApplicationContext());

        productosList = findViewById(R.id.productosList);
        productoAdapter = new ProductoAdapter(this, Productos.getCollection(),queue.getImageLoader());
        productosList.setAdapter(productoAdapter);
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        queue = QueueUtils.getInstance(this.getApplicationContext());
        productosList = findViewById(R.id.productosList);
        items = new ArrayList<>();
        Productos.injectContactsFromCloud(queue, items, this);
        Productos.sendRequestPOST(queue,this);
        productoAdapter = new ProductoAdapter (this,items,queue.getImageLoader());
        productosList.setAdapter(productoAdapter);

    }



    public void refreshList() {
        if ( productoAdapter!= null ) {
            productoAdapter.notifyDataSetChanged();
        }
    }
}
