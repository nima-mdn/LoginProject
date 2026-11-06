package com.example.project_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    EditText showUsername;
    EditText showWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        showUsername = findViewById(R.id.showUsername);
        showWelcome = findViewById(R.id.showWelcome);

        Intent intent = getIntent();

        String user = intent.getStringExtra("USERNAME");

        if (user != null) {

            showUsername.setText(user);

            showWelcome.setText("Welcome " + user + "!");

        }
    }
}