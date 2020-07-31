package org.study;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.study.service.MessageService;

public class ActionMain {

    public static void main(String[] args) {

        //ApplicationContext是最高级父类
        //ClassPathXmlApplicationContext是xml文件方式的子类
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:application-study.xml");

        System.out.println("context 启动成功");

        MessageService messageService = context.getBean(MessageService.class);

        System.out.println(messageService.getMessage());


    }

}
