package com.example.appquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        private TextView appname;

    public static ArrayList<Questionlist> list;
    Button startbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startbtn = findViewById(R.id.startbtn);
        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,login.class );
                startActivity(intent);

            }
        });
        list=new ArrayList<>();
        list.add(new Questionlist("What is the expression equal to :'1 + 2 * 3'?", "5" , "7" , "9" ,"7"));
        list.add(new Questionlist("The brain of any computer system is _________?", "CPU" , "Memory" , "Control unit" ,"CPU"));
        list.add(new Questionlist("Who is the first president of Tunisia?", "Habib Bourguiba" , "Hédi Nouira" , "Mahmoud El Materi" ,"Habib Bourguiba"));

    }

}