package com.springcore.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/auto/wire/config.xml");
        Employee emp = context.getBean("employee", Employee.class);
        System.out.println(emp);
    }
}
