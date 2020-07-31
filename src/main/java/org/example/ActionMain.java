package org.example;

import org.example.config.AppConfig;
import org.example.test.IndexService;
import org.example.test.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ActionMain {

    public static void main(String[] args) {

        //初始化spring容器
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService bean = ac.getBean(UserService.class);
        System.out.println(bean);

    }


}
