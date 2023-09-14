package com.example.ex20230914_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private static int numn2n(int begin,int end){
        int total = 0;
        for (int i = begin; i < end; i++) {
            total+=i;
        }
        return total;
    }
    public void btn1_Click(View view) {
        int total=numn2n(5,15);
        TextView output=(TextView) findViewById(R.id.textview1);
        output.setText(Integer.toString(total));
    }
}