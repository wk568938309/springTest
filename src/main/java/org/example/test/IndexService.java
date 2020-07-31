package org.example.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class IndexService {

    @Autowired
    private UserService userService;


    public IndexService(){
        System.out.println("constructor form indexService");

    }

//    public void getService(){
//        System.out.println(userService);
//    }

}
