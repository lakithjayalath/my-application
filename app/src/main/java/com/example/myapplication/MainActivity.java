package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    public Button button;
    public Button loginBtn;
    public Button facebookLoginBtn;
    public Button googleLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.country_codes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        button = findViewById(R.id.button9);
        loginBtn = findViewById(R.id.button7);
        facebookLoginBtn = findViewById(R.id.fbloginbutton);
        googleLoginBtn = findViewById(R.id.button6);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newActivity();
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginActivity();
            }
        });

        facebookLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fbLoginActivity();
            }
        });

        googleLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                googleLoginActivity();
            }
        });

    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void newActivity(){
        Intent intent = new Intent(this,SignUp.class);
        startActivity(intent);
    }

    public void loginActivity() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void fbLoginActivity() {
        Intent intent = new Intent(this, FacebookLogin.class);
        startActivity(intent);
    }

    public void googleLoginActivity() {
        Intent intent = new Intent(this, GoogleEmail.class);
        startActivity(intent);
    }
}
