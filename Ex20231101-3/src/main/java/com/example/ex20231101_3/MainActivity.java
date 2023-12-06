package com.example.ex20231101_3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener, View.OnClickListener {
    private TextView label;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        label = (TextView) findViewById(R.id.label);
        FrameLayout frame = (FrameLayout) findViewById(R.id.frame);
        frame.setOnTouchListener(this);
        frame.setOnClickListener(this);
    }

    @Override
    public boolean onTouch(View arg0, MotionEvent arg1) {
        // TODO Auto-generated method stub
        if (arg0.getId() != R.id.frame) {
            return true;
        }
        int act = arg1.getAction();
        switch (act) {
            case MotionEvent.ACTION_DOWN:
                label.setText("ACTION_DOWN");
                label.setTextColor(Color.RED);
                break;
            case MotionEvent.ACTION_UP:
                label.setText("ACTION_UP");
                label.setTextColor(Color.GREEN);
                break;
            case MotionEvent.ACTION_MOVE:
                float evt_x = arg1.getX();
                float evt_y = arg1.getY();
                int v_w = arg0.getWidth();
                int v_h = arg0.getHeight();
                label.setText("evt_x=" + evt_x + "\nevt_y=" + evt_y + "\nw=" + v_w + "\nvh=" + v_h);
                if (evt_x >= 0 && evt_x <= v_w && evt_x >= 0 && evt_y <= v_h) {
                    label.setTextColor(Color.RED);
                } else {
                    label.setTextColor(Color.GREEN);
                }
                break;
        }
        return false;
    }

    @Override
    public void onClick(View arg0) {
        // TODO Auto-generated method stub
        if (arg0.getId() == R.id.frame) {
            label.setText("Click");
            label.setTextColor(Color.BLUE);
        }

    }
}