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

public class Question3 extends AppCompatActivity {
    private TextView tv3;
    AppCompatButton op7, op8, op9;
    AppCompatButton bt3;

    private final List<Questionlist> Questionlistes = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        tv3 = findViewById(R.id.tv3);
        op7 = findViewById(R.id.op8);
        op8 = findViewById(R.id.op8);
        op9 = findViewById(R.id.op9);
        bt3 = findViewById(R.id.bt3);



        op7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        op8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        op9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Question3.this,Answer3.class );
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
