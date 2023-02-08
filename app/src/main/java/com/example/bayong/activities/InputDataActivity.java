package com.example.bayong.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.bayong.R;

public class InputDataActivity extends AppCompatActivity {

    private ImageButton backBtn;
    private Button analysisBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_data);

        backBtn = findViewById(R.id.backBtn);
        analysisBtn = findViewById(R.id.analysisBtn);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        analysisBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(InputDataActivity.this, DetailedEverythingActivity.class));
            }
        });
    }
}