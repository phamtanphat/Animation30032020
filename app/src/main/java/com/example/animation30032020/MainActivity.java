package com.example.animation30032020;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView mImgalpha,mImgScale,mImgTransition,mImgRotate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImgalpha = findViewById(R.id.imageAlpha);
        mImgScale = findViewById(R.id.imageScale);
        mImgTransition = findViewById(R.id.imageTransition);
        mImgRotate = findViewById(R.id.imageRotate);

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
        mImgTransition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startAnimation(R.anim.animation_tranisition,v);
//                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
//                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
//                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
            }
        });

        mImgRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAnimation(R.anim.animation_rotate,v);
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