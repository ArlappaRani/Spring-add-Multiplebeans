package com.spring.create3objects.SpringProject2;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("Config.xml");
        Laptop l1=(Laptop)ctx.getBean("lap1");
        Laptop l2=(Laptop)ctx.getBean("lap2");
        Laptop l3=(Laptop)ctx.getBean("lap3");
        
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        
        
    }
}
