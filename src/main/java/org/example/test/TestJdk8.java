package org.example.test;

import java.util.Optional;

public class TestJdk8 {

    public static void main(String[] args) {

        User u = new User();
        u.name = null;


        String st = Optional.ofNullable(u).map(user->user.name).orElse("not value");
        System.out.println(st);


    }


}

class User{

    public String name;




}
