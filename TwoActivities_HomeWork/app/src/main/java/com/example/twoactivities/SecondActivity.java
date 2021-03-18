package com.example.twoactivities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mShowCount = findViewById(R.id.show_count);
        Intent intent = getIntent();
        int count = intent.getIntExtra(MainActivity.COUNT_EXTRA, 0);
        mShowCount.setText("" + count);
    }
}