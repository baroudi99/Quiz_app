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

public class Question1 extends AppCompatActivity {
    private TextView tv1;
    AppCompatButton op1, op2, op3;
    AppCompatButton bt1;

    private final List<Questionlist> Questionlistes = new ArrayList<>();
    Button btnn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        tv1 = findViewById(R.id.tv1);
        op1 = findViewById(R.id.op1);
        op2 = findViewById(R.id.op2);
        op3 = findViewById(R.id.op3);
        bt1 = findViewById(R.id.bt1);



        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Question1.this,Answer.class );
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
