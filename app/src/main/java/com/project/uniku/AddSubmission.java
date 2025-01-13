package com.project.uniku;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class AddSubmission extends AppCompatActivity {

    private TextView selectedFileText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_submission);

        MaterialButton selectFileButton = findViewById(R.id.select_file_button);
        selectedFileText = findViewById(R.id.selected_file_text);

        ActivityResultLauncher<Intent> filePickerLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                result -> {
                    if (result.getResultCode() == RESULT_OK && result.getData() != null) {
                        Uri fileUri = result.getData().getData();
                        if (fileUri != null) {
                            selectedFileText.setText(fileUri.getPath());
                        } else {
                            selectedFileText.setText("Tidak ada file yang dipilih.");
                        }
                    }
                }
        );

        selectFileButton.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
            intent.setType("application/pdf"); // Memfilter hanya file PDF
            intent.addCategory(Intent.CATEGORY_OPENABLE);
            filePickerLauncher.launch(Intent.createChooser(intent, "Pilih File Dokumen"));
        });
    }
}
