package com.example.project_1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(v -> {

            String user = username.getText().toString().trim();
            String pass = password.getText().toString();

            if (user.equals("nima") && pass.equals("1234")) {

                Intent intent = new Intent(
                        MainActivity.this,
                        WelcomeActivity.class
                );

                intent.putExtra("USERNAME", user);

                startActivity(intent);

            } else {

                Toast.makeText(
                        MainActivity.this,
                        "Username or Password is incorrect",
                        Toast.LENGTH_SHORT
                ).show();

            }

        });
    }
}
