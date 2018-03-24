package com.cognition.app.mulika;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btnRegister = findViewById(R.id.btnLogin);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                /*Intent i = new Intent(Login.this, NewPost.class);
                Login.this.startActivity(i);*/
            }
        });
        AppCompatButton btnLogin= findViewById(R.id.btnNav);
        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View view) {
            Intent i = new Intent(Login.this, MainActivity.class);
            Login.this.startActivity(i);
            }
        });
    }
}
