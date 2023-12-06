package com.example.ex20231122_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class horoscope extends AppCompatActivity {
    final int[] bound = {20, 19, 21, 20, 21, 21, 23, 23, 23, 23, 22, 22};
    final String[] name = {"摩羯座", "水瓶座", "双鱼座", "白羊座", "金牛座", "双子座", "巨蟹座", "狮子座", "处女座", "天秤座", "天蝎座", "射手座"};
    private String horoscope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.horoscope);

        setContentView(R.layout.horoscope);
        displayHoroscope(); //自定义如下函数得到星座值
    }

    //新建函数
    private void displayHoroscope() {
        int month, day;
        //取得传递数据
        Intent myIntent = this.getIntent();
        month = myIntent.getIntExtra("MONTH", 1);
        day = myIntent.getIntExtra("DAY", 1);
        //显示星座
        TextView output = (TextView) findViewById(R.id.lblOutput);
        if (day < bound[month - 1]) {
            output.setText(name[month - 1]);
        } else if (month == 12)
            output.setText(name[0]);
        else
            output.setText(name[month]);
        horoscope = output.getText().toString();

    }

    public void btn2_Click(View view) {
        //创建新意图replyIntent挂载数据与onActivityResult形成对应关系
        Intent replyIntent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putString("HOROSCOPE", horoscope);
        replyIntent.putExtras(bundle);//#bundle#
        //设置返回,常量请求码启动活动的返回
        setResult(RESULT_OK, replyIntent);
        finish();
    }
}
