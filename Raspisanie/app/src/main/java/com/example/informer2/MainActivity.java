package com.example.informer2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Model> movies = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setData();

        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView=findViewById(R.id.rec);
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(this, movies);
        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void setData(){
        movies.add(new Model("Понедельник", "РМП\nРПМ", "РПМ", "ТПРиЗДБ", "Физ-ра","КС", "ТРПО", "Англ. яз", "","",""));
        movies.add(new Model("Вторник", "РМП", "РПМ", "ТПРиЗДБ", "","КС", "ТРПО", "Англ. яз", "Физ-ра","",""));
    }
}
