package com.e.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class DisplayMeaningActivity extends AppCompatActivity {
    private ListView firstMeaning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_meaning);

        firstMeaning = findViewById(R.id.firstMeaning);
         LoadMeaning();
    }

    private void LoadMeaning() {

    }
}
