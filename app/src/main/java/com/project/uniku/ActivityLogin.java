package com.project.uniku;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class ActivityLogin extends AppCompatActivity {

    // Static credentials for demo
    private static final String STATIC_USERNAME = "20220810017@uniku.ac.id";
    private static final String STATIC_PASSWORD = "Kuningan31122003";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Find views
        TextInputEditText usernameEditText = findViewById(R.id.username);
        TextInputEditText passwordEditText = findViewById(R.id.password);
        MaterialButton loginButton = findViewById(R.id.btn_login);
        MaterialButton callCenterButton = findViewById(R.id.call_center);

        // Set login button click listener
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get user input
                String username = usernameEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                // Validate credentials
                if (username.equals(STATIC_USERNAME) && password.equals(STATIC_PASSWORD)) {
                    // Successful login
                    Toast.makeText(ActivityLogin.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    // Navigate to another activity if needed
                    Intent intent = new Intent(ActivityLogin.this, ActivityNAV.class);
                    startActivity(intent);
                } else {
                    // Invalid credentials
                    Toast.makeText(ActivityLogin.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Set call center button click listener
        callCenterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open call center number in the phone dialer
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:08112200850"));
                startActivity(intent);
            }
        });
    }
}
