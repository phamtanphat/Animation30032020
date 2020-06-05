package com.example.animation30032020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mImgalpha,mImgScale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImgalpha = findViewById(R.id.imageAlpha);
        mImgScale = findViewById(R.id.imageScale);

        mImgalpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startAnimation(R.anim.animation_alpha,v);
            }
        });
        mImgScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAnimation(R.anim.animation_scale,v);
            }
        });
    }
    public void startAnimation(int idAnim , View v){
        Animation animation =
                AnimationUtils.loadAnimation(
                        MainActivity.this,
                        idAnim
                );
        v.startAnimation(animation);
    }
}