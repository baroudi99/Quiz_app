package com.example.appquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class listetheme extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listetheme);
        btn1 = findViewById(R.id.b1);
        btn2 = findViewById(R.id.b2);
        btn3 = findViewById(R.id.b3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(listetheme.this, Question1.class);
                startActivity(i);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(listetheme.this, Question2.class);
                startActivity(i);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(listetheme.this, Question3.class);
                startActivity(i);
            }
        });
    }
}