package com.example.ex20231018;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageButton imgBtn1, imgBtn2, imgBtn3;
    Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] imageArray = {R.drawable.d13, R.drawable.d8, R.drawable.h11};
        imgBtn1 = (ImageButton) findViewById(R.id.img1);

        imgBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rnd = new Random().nextInt(imageArray.length);
                imgBtn1.setImageResource(imageArray[rnd]);
            }
        });

        imgBtn2 = (ImageButton) findViewById(R.id.img2);

        imgBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rnd = new Random().nextInt(imageArray.length);
                imgBtn2.setImageResource(imageArray[rnd]);
            }
        });

        imgBtn3 = (ImageButton) findViewById(R.id.img3);

        imgBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int rnd = new Random().nextInt(imageArray.length);
                imgBtn3.setImageResource(imageArray[rnd]);
            }
        });
    }

    public void btn1_Click(View view) {
        imgBtn1.setImageResource(R.drawable.back);
        imgBtn2.setImageResource(R.drawable.back);
        imgBtn3.setImageResource(R.drawable.back);
    }
}