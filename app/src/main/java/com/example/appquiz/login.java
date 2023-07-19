package com.example.appquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class login extends AppCompatActivity {
    Button login_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView username= (TextView)  findViewById(R.id.username);
        TextView password= (TextView)  findViewById(R.id.password);
        MaterialButton loginbtn= (MaterialButton) findViewById(R.id.loginbtn);
        login_button = findViewById(R.id.loginbtn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("lobna")&& password.getText().toString().equals("riadh")) {
                    Toast.makeText(login.this,"LOGIN SUCCESSFUL",Toast.LENGTH_LONG ).show();
                }else {
                    Toast.makeText(login.this, "LOGIN failed !!!", Toast.LENGTH_LONG).show();


                }
                login_button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent= new Intent(login.this,listetheme.class );
                        startActivity(intent);

                    }
                });

            }

        });

    }
}