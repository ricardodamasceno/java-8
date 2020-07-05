package com.br.lab;

import java.util.*;
import java.util.function.Consumer;

public class SortValues {

    public static void main (String[] args){

        List<String> values = getValues();
        sort(values);
        System.out.println(values);

    }

    private static void sort(List<String>values){
        values.sort(Comparator.naturalOrder());
    }

    private static void sortOld(List<String>values){
        Collections.sort(values);
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
