package com.example.a13_da.magazineapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MagazineListActivity extends AppCompatActivity {
    private List<Magazine> magazins = new ArrayList<>();
    private Magazine mag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magazine_list);

        initMagazins();

        RecyclerView recyclerView = findViewById(R.id.list_recycler);
        DataAdapter adapter = new DataAdapter(this, magazins);
        recyclerView.setAdapter(adapter);
        LinearLayoutManager manager = new LinearLayoutManager(this, LinearLayout.VERTICAL, false);
        recyclerView.setLayoutManager(manager);

        final EditText inputText = findViewById(R.id.list_input);

        Button buttonAdd = findViewById(R.id.list_buttonAdd);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (inputText.getText().toString().length() != 0) {
                    mag = new Magazine(inputText.getText().toString(), "Адрес по умолчанию", User.getInstance().getName());
                    magazins.add(mag);
                }
            }
        });

    }
    private void initMagazins(){
        magazins.add(new Magazine("Магазин 1", "Адрес 1", "Директор 1"));
        magazins.add(new Magazine("Магазин 2", "Адрес 2", "Директор 2"));
        magazins.add(new Magazine("Магазин 3", "Адрес 3", "Директор 3"));
    }
}
