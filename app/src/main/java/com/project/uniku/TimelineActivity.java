package com.project.uniku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TimelineActivity extends AppCompatActivity {

    private Button addSubmission;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);

        addSubmission = findViewById(R.id.add_submission);


        addSubmission.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Navigate to AddSubmissionActivity
                    Intent intent = new Intent(TimelineActivity.this, AddSubmission.class);
                    startActivity(intent);
            }
        });
    }
}