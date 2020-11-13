package com.example.hyeoktest1102;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MyService.class);
                Student s = new Student("hyeok","99","seoul","01012346789");
                intent.putExtra("test",s);
                // intent에 포함된 Parcelable Student를 StartService 하여 서비스로 보냄.
                startService(intent);
            }
        });

    }   // EO onCreate()


}   // EO class