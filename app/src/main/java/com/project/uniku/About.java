package com.project.uniku;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_about);

        Button maps = findViewById(R.id.maps);
        Button telp = findViewById(R.id.telp);

        maps.setOnClickListener(v -> {
            String mapsurl = "https://maps.app.goo.gl/i72xTKVHFGz3Bq9F9";
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(mapsurl));
            startActivity(intent);
        });

        telp.setOnClickListener(v -> {
            String notlp = "08112200850";
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + notlp));
            startActivity(intent);
        });

    }
}