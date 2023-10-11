package com.example.ex20231018;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageButton imgBtn1, imgBtn2, imgBtn3, btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBtn1 = (ImageButton) findViewById(R.id.img1);

        imgBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgBtn1.setImageResource(R.drawable.d13);
            }
        });

        imgBtn2 = (ImageButton) findViewById(R.id.img2);

        imgBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgBtn2.setImageResource(R.drawable.d8);
            }
        });

        imgBtn3 = (ImageButton) findViewById(R.id.img3);

        imgBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgBtn3.setImageResource(R.drawable.h11);
            }
        });
    }

    public void btn1_Click(View view) {
        imgBtn1.setImageResource(R.drawable.back);
        imgBtn2.setImageResource(R.drawable.back);
        imgBtn3.setImageResource(R.drawable.back);
    }
}