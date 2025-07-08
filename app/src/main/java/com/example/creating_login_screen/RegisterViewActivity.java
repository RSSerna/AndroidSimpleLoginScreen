package com.example.creating_login_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_view);

        // Find the TextView for the login link and the Register button
        TextView loginLink = findViewById(R.id.login_link);
        Button registerButton = findViewById(R.id.register_button);

        // Set an OnClickListener for the login link
        loginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate back to the MainActivity
                Intent intent = new Intent(RegisterViewActivity.this, MainActivity.class);
                startActivity(intent); // Start the login activity
            }
        });

        // Set an OnClickListener for the Register button
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Display a Toast message when the Register button is clicked
                Toast.makeText(RegisterViewActivity.this, "User  clicked on register", Toast.LENGTH_SHORT).show();
            }
        });
    }
}