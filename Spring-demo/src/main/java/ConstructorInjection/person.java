package ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class person
{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public calculate getC() {
        return c;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setC(calculate c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", c=" + c +
                '}';
    }

    //Ques 6: Perform Constructor Injection in a Spring Bean
    private calculate c;
      @Autowired
      public person()
     {
          this.c = c;
     }



}
