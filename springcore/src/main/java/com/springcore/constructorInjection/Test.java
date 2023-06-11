package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorInjection/ciconfig.xml");
        person p = (person) context.getBean("person");
        System.out.println(p);

        Addition a = (Addition) context.getBean("add");
        a.sum();
        // by giving type attribute in bean in config.xml, it will call the particular constructor
        // by default it will try to look for the string constructor, else starts checking from top to bottom in order
    }
}
