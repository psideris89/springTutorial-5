package com.psideris.spring.annotation_tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/psideris/spring/annotation_tutorial/beans/beans.xml");
        
//        Logger logger = (Logger) context.getBean("logger");
//        logger.writeConsole("Hello there");
//        logger.writeFile("Hi again");
        
        Robot robot = (Robot) context.getBean("robot");
        robot.speak();
        
        ((ClassPathXmlApplicationContext) context).close();
    }
}
