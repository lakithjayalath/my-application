package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditMobile extends AppCompatActivity {

    public Button cancelBtn;
    public Button confirmBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_mobile);

        cancelBtn = findViewById(R.id.cancel);
        confirmBtn = findViewById(R.id.submit);

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cancelEdit();
            }
        });

        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                confirmEdit();
            }
        });
    }

    public void cancelEdit() {
        Intent intent = new Intent(this, EditProfile.class);
        startActivity(intent);
    }

    public void confirmEdit() {
        Intent intent = new Intent(this, EditProfile.class);
        startActivity(intent);
    }
}
