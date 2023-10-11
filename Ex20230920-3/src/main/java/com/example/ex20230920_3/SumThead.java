package com.example.ex20230920_3;

import android.util.Log;

public class SumThead extends Thread {
    private static final String TAG = "A线程处理";
    private long lenth;

    public SumThead(long lenth, String name) {
        super(name);
        this.lenth = lenth;
    }

    public void run() {
        long temp = 0;
        for (long i = 1; i <= lenth; i++) {
            try {
                Thread.sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            temp += 1;
            Log.d(TAG, Thread.currentThread() + "总和" + temp);
        }
    }
}
