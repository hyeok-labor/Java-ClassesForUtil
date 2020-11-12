package com.example.hyeoktest1102;

import android.os.Bundle;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class SetAnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button)findViewById(R.id.button1);
        final ImageView iv = (ImageView)findViewById(R.id.imageView1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 이미지를 from X,Y(로부터) to X,Y(까지) 확장
                ScaleAnimation anim=
                        new ScaleAnimation(0,10,0,10);
                anim.setDuration(2000); // 표현 시간
                iv.startAnimation(anim);
            }
        });
    }   // EO onCreate()
}   // EO class