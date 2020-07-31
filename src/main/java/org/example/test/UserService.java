package org.example.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserService {

    @Autowired
    private IndexService indexService;

    public UserService(){
        System.out.println("constructor form userservice");

    }

//    public void getService(){
//        System.out.println(indexService);
//    }
}
