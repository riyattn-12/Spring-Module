package ConstructorInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class Main {
    public static void main(String[] args)
    {

        //(4) Get a Spring Bean from application context and display its properties.
        ApplicationContext applicationContext = SpringApplication.run(Main.class,args);
        person p = applicationContext.getBean(person.class);

        p.setName("riya");
        p.setAge(22);
        System.out.println(p.getAge());
        System.out.println(p.getName());

    }
}
