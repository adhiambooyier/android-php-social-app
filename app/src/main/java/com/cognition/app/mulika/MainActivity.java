package com.cognition.app.mulika;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatButton btnLogin = findViewById(R.id.btnNavR);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent i = new Intent(MainActivity.this, NewPost.class);
                MainActivity.this.startActivity(i);
            }
        });
        AppCompatButton btnNewUser = findViewById(R.id.btnRegister);
        btnNewUser.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Log.d("Mulika", "Fields are Empty!");
                //Intent i = new Intent(MainActivity.this, MainActivity.class);
                //MainActivity.this.startActivity(i);
            }
        });
    }
    }

