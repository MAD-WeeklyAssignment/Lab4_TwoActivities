package com.example.twoactivities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String TEXT_PASSAGE_NO = "com.example.twoactivities.extra.TEXT_PASSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        int id = view.getId();
        int textPassageNumber = 1;

        if (id == R.id.button_two) {
            textPassageNumber = 2;
        } else if (id == R.id.button_three) {
            textPassageNumber = 3;
        }

        intent.putExtra(TEXT_PASSAGE_NO, textPassageNumber);
        startActivity(intent);
    }
}