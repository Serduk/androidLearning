package com.example.serdyuk.androidlearning;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickButton(View view) {
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner brands_arr = (Spinner) findViewById(R.id.brands_arr);

        brands.setText(brands_arr.getSelectedItem().toString());

        System.out.println("Clicked!");
        System.out.println(brands_arr.getSelectedItem());
    }
}
