package com.example.twoactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String COUNT_EXTRA = "com.example.twoactivities.extra.COUNT";
    private TextView mCount;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCount = findViewById(R.id.count);
        count = Integer.parseInt(mCount.getText().toString());
    }

    public void sayHello(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(COUNT_EXTRA, count);
        startActivity(intent);
    }

   
}