package com.br.lab;

import com.br.lab.utils.StringUtils;

import java.util.*;
import java.util.function.Consumer;

public class SortValues {

    public static void main (String[] args){

        List<String> values = StringUtils.getValues();
        sort(values);
        System.out.println(values);

    }

    private static void sort(List<String>values){
        values.sort(Comparator.naturalOrder());
    }

    private static void sortOld(List<String>values){
        Collections.sort(values);
    }

}
