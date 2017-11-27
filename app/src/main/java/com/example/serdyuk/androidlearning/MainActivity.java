package com.example.serdyuk.androidlearning;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {
    private BeerExpert beerExpert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickButton(View view) {
        TextView brands = findViewById(R.id.brands);
        Spinner brands_arr = findViewById(R.id.brands_arr);

        List<String> recommendations = beerExpert.getBrands(brands_arr.getSelectedItem().toString());
        StringBuilder recommendationResult = new StringBuilder();

        for (String result : recommendations) {
            recommendationResult.append(result).append("\n");
        }

        brands.setText(recommendationResult.toString());
        System.out.println("Clicked!");
        System.out.println(brands_arr.getSelectedItem());
        System.out.println("Results should be:\n" + recommendationResult.toString());
    }
}
