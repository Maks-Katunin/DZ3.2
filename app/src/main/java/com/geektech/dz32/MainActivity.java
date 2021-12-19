package com.geektech.dz32;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Person> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
        loadData();

    }

    private void loadData() {
        data = new ArrayList<>();
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
        data.add(new Person(R.drawable.alba, "Jessica Alba"));
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recycler);
        PersonAdapter adapter = new PersonAdapter(data);
        recyclerView.setAdapter(adapter);

    }
}