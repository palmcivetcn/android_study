package com.example.ex20230920_3;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "B线程处理";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn1_Click(View view) {
        SumThead st = new SumThead(150, "线程A");
        st.start();
        new Thread("线程B") {
            int length = 150;

            public void run() {
                long temp = 0;
                for (long i = 1; i <= length; i++) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    temp += 1;
                    Log.d(TAG, Thread.currentThread() + "总和" + temp);
                }
            }
        }.start();
    }
}