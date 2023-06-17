package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
        context.registerShutdownHook();
        // Samosa s = (Samosa) context.getBean("samosa");
        // System.out.println(s);
        
        // Pepsi p = (Pepsi) context.getBean("pepsi");
        // System.out.println(p);

        Example example = (Example) context.getBean("example");
        System.out.println(example);
        
    }
}
