package com.example.noteme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class NewNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_note);

        // Handle back button click to return to MainActivity
        ImageView ivBack = findViewById(R.id.ivBack);
        ivBack.setOnClickListener(view -> {
            // Go back to the main screen
            Intent intent = new Intent(NewNoteActivity.this, MainActivity.class);
            startActivity(intent);
            finish();  // Finish the activity to remove it from the back stack
        });

        // Handle Save Note button click
        findViewById(R.id.btnSaveNote).setOnClickListener(view -> {
            // Save note logic can be added later (currently navigating back)
            Intent intent = new Intent(NewNoteActivity.this, MainActivity.class);
            startActivity(intent);
            finish();  // Finish the activity to remove it from the back stack
        });
    }

    @Override
    public void onBackPressed() {
        // Override back button to return to the home screen
        Intent intent = new Intent(NewNoteActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
