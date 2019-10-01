package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity {

    public Button backBtn;
    public Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        backBtn = findViewById(R.id.back_button);
        submitBtn = findViewById(R.id.submit);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goBack();
            }
        });

        submitBtn.setOnClickListener(new View.OnClickListener() {
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
