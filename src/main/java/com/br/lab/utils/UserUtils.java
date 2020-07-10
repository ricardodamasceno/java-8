package com.br.lab.utils;

import com.br.lab.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserUtils {

    public static List<User> createUsers(){

        List<User> users = new ArrayList<User>();

        for(int i = 0; i < 10; i++){
            User user = new User("User - ".concat(Integer.toString(i)), "Email - ".concat(Integer.toString(i)), i);
            users.add(user);
        }
        return users;
    }


}
