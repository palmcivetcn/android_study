package com.example.ex20231122_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int SET_HOROSCOPE = 1;
    private EditText txtMonth;
    private EditText txtDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtMonth = (EditText) findViewById(R.id.txtMonth);
        txtMonth.setText("1");
        txtDay = (EditText) findViewById(R.id.txtDay);
        txtDay.setText("1");
    }

    public void btn1_Click(View view) {
        int month, day;
        month = Integer.parseInt(txtMonth.getText().toString());
        day = Integer.parseInt(txtDay.getText().toString());
        if ((month < 1 || month > 12) || (day < 1 || day > 31)) {
            Toast.makeText(MainActivity.this, "日期范围错误!", Toast.LENGTH_LONG).show();
            return;
        }
        //构建意图intent
        Intent myIntent = new Intent(this, horoscope.class);
        //挂载数据
        myIntent.putExtra("MONTH", month);
        myIntent.putExtra("DAY", day);
        //启动活动并且返回数据结果
        startActivityForResult(myIntent, SET_HOROSCOPE);
        //startActivity (myIntent) ;
    }

    @Override //取得返回数据
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) { //常量请求码启动活动的返回
            case SET_HOROSCOPE:
                if (resultCode == RESULT_OK) {
                    Bundle bundle = data.getExtras();
                    TextView output = (TextView) findViewById(R.id.lblResult);
                    output.setText("上一次的历史记录:\n生日:" + txtMonth.getText() + "月" + txtDay.getText() + "日\n星座:" + bundle.getString("HOROSCOPE"));
                }
                break;
        }
    }
};
