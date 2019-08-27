package com.example.layouts_hemas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
List<Cell> listitems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        listitems=new ArrayList<Cell>();
        for(int i=1;i<=10;i++)
        {
            Cell cell=new Cell();
            cell.setRoutecode("RS00230"+String.valueOf(i));
            cell.setOutlets_delivered(i);
            listitems.add(cell);
        }


        recyclerView.setAdapter(new Adapter_recycler(listitems,this));
    }
}
