package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerAdapter adapter = new RecyclerAdapter(generateList());
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.simple_recyclerview);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
    private List<RecyclerViewModel> generateList(){
        List<RecyclerViewModel> recyclerViewModelList = new ArrayList<>();

        for(int i =0 ; i <100; i++) {
            recyclerViewModelList.add(new RecyclerViewModel(String.format(Locale.US,"index number %d",i)));
        }
        return recyclerViewModelList;
    }

}