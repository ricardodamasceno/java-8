package com.br.lab;

import com.br.lab.model.User;
import com.br.lab.utils.UserUtils;

import java.util.List;

public class Streams {

    public static void main (String[] args){

        List<User> users = UserUtils.createUsers();
        getSumAge(users);
        listUserNames(users);

    }

    private static void getSumAge(List<User> users){
        int ageSum = users.stream()
                .filter(user -> user.getAge() > 3)
                .mapToInt(User::getAge)
                .sum();

        System.out.println(ageSum);
    }

    private static void listUserNames(List<User> users){
        users.stream()
                .filter(user -> user.getAge() > 3)
                .forEach(user -> {
                    System.out.println(user.getName());
                });

    }

}
