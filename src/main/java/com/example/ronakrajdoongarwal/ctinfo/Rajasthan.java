package com.example.ronakrajdoongarwal.ctinfo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Rajasthan extends AppCompatActivity {
    TextView tv;
    TextView desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajasthan);
        tv=(TextView)findViewById(R.id.textView);
        tv.setText("Welcome to " + MainActivity.scapital);
        desc=(TextView)findViewById(R.id.desc);
        desc.setText(MainActivity.sdescription);
        RelativeLayout rl = (RelativeLayout) findViewById(R.id.rl);
      int resId = getResources().getIdentifier(MainActivity.scapital.toLowerCase(), "drawable", getPackageName());

        rl.setBackgroundResource(resId);
    }
}
