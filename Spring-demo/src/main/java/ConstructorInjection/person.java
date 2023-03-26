package ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class person
{

    //Ques 6: Perform Constructor Injection in a Spring Bean
    @Autowired
    private calculate c;

    public person(calculate c)
    {
        this.c = c;
    }



}
