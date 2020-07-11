package com.br.lab;

import com.br.lab.model.User;
import com.br.lab.utils.UserUtils;

import java.util.List;
import java.util.Optional;

public class Streams {

    public static void main (String[] args){

        List<User> users = UserUtils.createUsers();
        getSumAge(users);
        listUserNames(users);
        filterUser(users);
        getUser(users);
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

    private static void filterUser(List<User> users){
        users.stream()
                .filter(user -> user.getAge() > 8)
                .findAny()
                .ifPresent(user -> System.out.println(user.getName()));

    }

    private static void getUser(List<User> users){
        Optional<User> user2 = users.stream()
                .filter(user -> user.getAge() > 8)
                .findAny();

        User user = Optional.ofNullable(user2).get().orElse(null);
        System.out.println("Usuario " + user.getName());

    }

}
