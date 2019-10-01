package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    public Button backBtn;
    public Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        backBtn = findViewById(R.id.back_button);
        loginBtn = findViewById(R.id.login);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goBack();
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                submitted();
            }
        });
    }

    public void goBack() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void submitted() {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}
