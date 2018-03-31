package com.example.devajayantha.devatecnogrosir;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    ProductAdapter adapter;


    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        productList = new ArrayList<>();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        productList.add(
                new Product(
                        1,
                        "Iphone X - (64 / 256 GB )",
                        "5,61 inci x 0,30 inci, Silver,Gold,  174 gram",
                        "Rp 15.500.000",
                        R.drawable.iphonex));

        productList.add(
                new Product(
                        1,
                        "Iphone 7 - (16 /64 / 256 GB )",
                        "5,61 inci x 0,30 inci, Silver,Gold,  174 gram",
                        "Rp 9.500.000",
                        R.drawable.iphone7));

        productList.add(
                new Product(
                        1,
                        "Samsung Galaxy S8",
                        "5,86 inci x 2.68 inci, Black,  155 gram",
                        "Rp 4.500.000",
                        R.drawable.samsung));
        productList.add(
                new Product(
                        1,
                        "Nokia 5",
                        "5,86 inci x 2.68 inci, Black,Gold,  155 gram",
                        "Rp 3.500.000",
                        R.drawable.nokia5));
        productList.add(
                new Product(
                        1,
                        "Iphone 6s 128GB",
                        "5,69 inci x 2.55 inci, Silver,Gold,  140 gram",
                        "Rp 8.500.000",
                        R.drawable.iphone6s));
        productList.add(
                new Product(
                        1,
                        "Iphone 8s ( 64 / 256 GB )",
                        "5,40 inci x 2.69 inci, Silver,  146 gram",
                        "Rp 10.750.000",
                        R.drawable.iphone8));
        productList.add(
                new Product(
                        1,
                        "Samsung Galaxy A3 ",
                        "5,20 inci x 2.55 inci,  156 gram",
                        "Rp 9.050.000",
                        R.drawable.samsunga3));

        adapter =new ProductAdapter(this, productList);
        recyclerView.setAdapter(adapter);
    }
}
