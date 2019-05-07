package com.e.sqlite;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import helper.MyHelper;
import model.Word;

public class DisplayMeaningActivity extends AppCompatActivity {
    private TextView tvMeaning;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_meaning);

        tvMeaning = findViewById(R.id.tvMeaning);

        Bundle bundle = getIntent().getExtras();

        if(bundle!=null){
            String meaning = bundle.getString("meaning");
            tvMeaning.setText(meaning);
        }
    }






}
