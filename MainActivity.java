package com.example.myapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSelect = findViewById(R.id.btn_select_video);
        Button btnStart = findViewById(R.id.btn_start_ghostcam);

        btnSelect.setOnClickListener(v -> 
            Toast.makeText(this, "Video Selected (Demo)", Toast.LENGTH_SHORT).show()
        );

        btnStart.setOnClickListener(v -> 
            Toast.makeText(this, "GhostCam Started (Demo)", Toast.LENGTH_SHORT).show()
        );
    }
}