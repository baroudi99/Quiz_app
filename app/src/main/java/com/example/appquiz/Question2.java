package com.example.appquiz;

import static com.example.appquiz.MainActivity.list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Question2 extends AppCompatActivity {
    private TextView tv2;
    AppCompatButton op4, op5, op6;
    AppCompatButton bt2;

    private final List<Questionlist> Questionlistes = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        tv2 = findViewById(R.id.tv2);
        op4 = findViewById(R.id.op4);
        op5 = findViewById(R.id.op5);
        op6 = findViewById(R.id.op6);
        bt2 = findViewById(R.id.bt2);



        op4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        op5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        op6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Question2.this,Answer2.class );
                startActivity(intent);


            }
        });




    }


    private int getCorrectAnswers() {
        int correctAnswers = 0;

        for (int i = 0; i < Questionlistes.size(); i++) {

            final String getUserSelectAnswers = Questionlistes.get(i).getUserSelectAnswers();
            final String getAnswers = Questionlistes.get(i).getAnswers();

            if (getUserSelectAnswers.equals(getAnswers)) {

                correctAnswers++;
            }

        }
        return correctAnswers;

    }

    private int getInCorrectAnswer(){
        int correctAnswers = 0;

        for (int i = 0; i < Questionlistes.size(); i++) {

            final String getUserSelectAnswers = Questionlistes.get(i).getUserSelectAnswers();
            final String getAnswers = Questionlistes.get(i).getAnswers();

            if (!getUserSelectAnswers.equals(getAnswers)) {

                correctAnswers++;
            }
        }
        return correctAnswers;

    }

}
