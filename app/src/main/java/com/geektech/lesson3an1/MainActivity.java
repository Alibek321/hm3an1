package com.geektech.lesson3an1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<country> countryList ;
    private RecyclerView recyclerView;
    private UserAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createList();
        initRv();

    }

    private void createList() {
        countryList = new ArrayList<>();
        countryList.add(new country("france","paris",R.drawable.fr));
        countryList.add(new country("Kyrgyzstan","Bishkek",R.drawable.pi8));
        countryList.add(new country("China","Pekin",R.drawable.pi10));
        countryList.add(new country("Russian Federation","Moscow",R.drawable.pi17));
        countryList.add(new country("Ukraine","Kyiv ",R.drawable.uk));
        countryList.add(new country("Spain","Madrid",R.drawable.pi16));
        countryList.add(new country("Germany","Berlin",R.drawable.ger));
        countryList.add(new country("Argentina","Buenos Aires",R.drawable.pi15));
        countryList.add(new country("Belarus","Minsk",R.drawable.pi14));
        countryList.add(new country("USA","Washington",R.drawable.usa));
        countryList.add(new country("Japan ","Tokyo ",R.drawable.pi13));
        countryList.add(new country("Egypt","Cairo",R.drawable.pi11));
        countryList.add(new country("Mongolia","Ulan Bator",R.drawable.pi18));
        countryList.add(new country("Iran","Tehran",R.drawable.pi19));
        countryList.add(new country("Kazakhstan","Astana",R.drawable.kz));

    }

    private void initRv(){
        recyclerView = findViewById(R.id.mini_recyler);
        adapter = new UserAdapter();
        adapter.setListName(countryList);
        recyclerView.setAdapter(adapter);
    }
}