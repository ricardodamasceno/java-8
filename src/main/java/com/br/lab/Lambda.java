package com.br.lab;

import com.br.lab.utils.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lambda {

    public static void main (String[] args){

        List<String> values = StringUtils.getValues();
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
}
