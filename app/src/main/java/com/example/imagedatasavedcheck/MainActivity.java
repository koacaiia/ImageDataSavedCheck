package com.example.imagedatasavedcheck;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnCapture,btnGallery;
    RecyclerView recyclerViewGallery;
    SurfaceView surfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}