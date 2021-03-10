package com.example.a18028481_lnhtuynhng;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvGoogle;
    CustomerGoogleAdt adtGoogle;
    ArrayList<Google> arrGoogle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvGoogle= findViewById(R.id.lvGoogle);

        arrGoogle= new ArrayList<>();
        arrGoogle.add(new Google("Google","80$", R.drawable.google));
        arrGoogle.add(new Google("Code","90$", R.drawable.code));
        arrGoogle.add(new Google("Android","100$", R.drawable.and));

        adtGoogle= new CustomerGoogleAdt(this, R.layout.item_listview, arrGoogle);

        lvGoogle.setAdapter(adtGoogle);
    }
}