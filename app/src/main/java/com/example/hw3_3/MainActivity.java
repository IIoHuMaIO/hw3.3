package com.example.hw3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycleViewSecond;
    private ArrayList<String> namePersonContact = new ArrayList<>();
    private AdapterPerson adapterPersonContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.black));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        recycleViewSecond = findViewById(R.id.recycleViewSecond);
        loadData();
        adapterPersonContact = new AdapterPerson(namePersonContact);
        recycleViewSecond.setAdapter(adapterPersonContact);
    }

    private void loadData() {
        namePersonContact.add("I");
        namePersonContact.add("Dont");
        namePersonContact.add("Know");
        namePersonContact.add("What");
        namePersonContact.add("Names");
        namePersonContact.add("Can");
        namePersonContact.add("I");
        namePersonContact.add("Write");
        namePersonContact.add("Here");
        namePersonContact.add("And");
        namePersonContact.add("That");
        namePersonContact.add("Not");
        namePersonContact.add("So");
        namePersonContact.add("Cool");
        namePersonContact.add("For");
        namePersonContact.add("Me");
        namePersonContact.add("._.");
        namePersonContact.add("-_-");
    }
}