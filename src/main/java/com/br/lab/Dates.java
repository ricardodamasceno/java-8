package com.br.lab;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dates {

    public static void main(String [] args){

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(localDate.format(formatter));

        LocalDate localDate2 = localDate.plusDays(2);
        System.out.println(localDate2.format(formatter));

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        System.out.println(localDateTime.format(formatter2));

    }

}
