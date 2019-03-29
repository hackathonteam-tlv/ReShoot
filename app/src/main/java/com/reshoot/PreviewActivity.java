package com.reshoot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class PreviewActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);

        imageView = findViewById(R.id.imageView);

        String filePath = getIntent().getStringExtra(MainActivity.TAKEN_IMAGE_PATH_KEY);
        Glide.with(this).load(filePath).into(imageView);
    }
}
