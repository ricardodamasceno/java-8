package com.br.lab;

import com.br.lab.utils.StringUtils;

import java.util.List;

public class MethodReferences {

    //The two dots call functions
    public static void main(String[]args){
        List<String> values = StringUtils.getValues();
        values.forEach(System.out::println);
    }

}
