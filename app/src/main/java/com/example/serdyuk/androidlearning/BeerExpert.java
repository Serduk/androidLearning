package com.example.serdyuk.androidlearning;

import java.util.ArrayList;
import java.util.List;

/**
 * Logic class for beer choosing
 *
 * Created by serdyuk on 11/12/17.
 */

public class BeerExpert {
    List<String> getBrands(String brands_arr) {
        List<String> brands = new ArrayList<String>();
        if (brands_arr.toLowerCase().equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jails");
            brands.add("Gout Scout");
        }

        return brands;
    }
}
