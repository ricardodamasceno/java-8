package com.br.lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda {

    public static void main (String[] args){

        List<String> values = getValues();
        lambdaIteration(values);
        System.out.println(values);

    }

    private static void lambdaIteration(List<String>values){
        values.forEach(value -> {
            System.out.println(value);
        });
    }

    private static void oldIteration(List<String>values){
        for(String value: values){
            System.out.println(value);
        }
    }

    private static List<String> getValues(){
        List<String> values = new ArrayList<String>();
        values.add("Black Lab");
        values.add("Yellow Lab");
        values.add("Brown Lab");
        values.add("Some other dog");
        return values;
    }

}
