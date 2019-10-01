package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    public Button logOutBtn;
    public Button editBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        logOutBtn = findViewById(R.id.logout);
        editBtn = findViewById(R.id.edit);

        logOutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logOut();
            }
        });

        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editProfile();
            }
        });
    }

    public void logOut() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void editProfile() {
        Intent intent = new Intent(this, EditProfile.class);
        startActivity(intent);
    }
}
