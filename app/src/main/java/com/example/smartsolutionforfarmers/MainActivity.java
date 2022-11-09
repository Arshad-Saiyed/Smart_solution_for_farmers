package com.example.smartsolutionforfarmers;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import org.jetbrains.annotations.Contract;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    private Button recommend;
    private Button detect;
    private Uri imageUri;
    private ImageView imgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recommend = findViewById(R.id.crop);
        recommend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Recommendation.class);
                startActivity(intent);
            }
        });

        detect = findViewById(R.id.disease);
        detect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Detection.class);
                startActivity(intent);
            }
        });


    }
}