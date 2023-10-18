package com.example.ex20231018_2;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToggleButton toggle = (ToggleButton) findViewById(R.id.toggleBtn);
        toggle.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
        if (arg1) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        } else {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }
    }

}