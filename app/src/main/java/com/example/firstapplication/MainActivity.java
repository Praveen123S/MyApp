package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView image=findViewById(R.id.image);
        image.setImageBitmap(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher_round));
    }
}