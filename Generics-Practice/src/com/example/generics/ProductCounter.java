package com.example.generics;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProductCounter {
    Map<String, String> productNames = new TreeMap<>();
    TreeMap<String, Long> productCountMap = new TreeMap<>();
    // Create a Counting Map
    // Create a Name Mapping Map
aaaaaa
    public static void main(String[] args) {

        // List of part data
        String[] parts = new String[]{"1S01", "1S01", "1S01", "1S01", "1S01", "1S02", "1S02", "1S02", "1H01", "1H01", "1S02", "1S01", "1S01", "1H01", "1H01", "1H01", "1S02", "1S02", "1M02", "1M02", "1M02"};

        // Create Product Name Part Number map
        Map<String, String> productNames = new TreeMap<>();
        productNames.put("Blue Polo Shirt", "1S01");
        productNames.put("Black Polo Shirt", "1S02");
        productNames.put("Red Ball Cap", "1H01");
        productNames.put("Duke Mug   ", "1M02");

        // Create Product Counter Object and process data
    }

    public ProductCounter(Map productNames) {
        this.productNames = productNames;
        // Your code here
    }

    public void processList(String[] list) {
        for(String a : list){
            if(!productNames.containsValue(a))
                productCountMap.put(a, new Long(1));
            else
                productCountMap.put(getKey(productNames,a), new Long(1));
                        
                        }
                        

    }

    public void printReport() {
        // Your code here
    }
}
