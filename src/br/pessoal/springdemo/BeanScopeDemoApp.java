package br.pessoal.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        TrackCoach firstCoach = context.getBean("myCoach", TrackCoach.class);

        TrackCoach secondCoach = context.getBean("myCoach", TrackCoach.class);

        boolean result = (firstCoach == secondCoach);
        System.out.println("Pointing to the same object: "+result);
        System.out.println("Memory location from the firstCoach: "+firstCoach);
        System.out.println("Memory location from the firstCoach: "+secondCoach);
    }
}
