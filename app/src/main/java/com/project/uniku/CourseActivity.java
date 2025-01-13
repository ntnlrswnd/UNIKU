package com.project.uniku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CourseActivity extends AppCompatActivity {

    private View detailMk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        // Pindahkan findViewById ke sini, setelah setContentView
        detailMk = findViewById(R.id.bp3);

        detailMk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to DetailMatkul
                Intent intent = new Intent(CourseActivity.this, DetailMatkul.class);
                startActivity(intent);
            }
        });
    }
}
