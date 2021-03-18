package com.example.twoactivities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private TextView mTextPassage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mTextPassage = findViewById(R.id.text_passage);
        Intent intent = getIntent();
        int textPassageNumber = intent.getIntExtra(MainActivity.TEXT_PASSAGE_NO, 1);

        if (textPassageNumber == 1) {
            mTextPassage.setText(R.string.text_passage_one);
        } else if (textPassageNumber == 2) {
            mTextPassage.setText(R.string.text_passage_two);
        } else if (textPassageNumber == 3) {
            mTextPassage.setText(R.string.text_passage_three);
        }

    }
}