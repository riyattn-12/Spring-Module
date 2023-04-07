package com.example.Rest_Api_Part2.Versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserVersioning
{

    //Versioning with URL
    @GetMapping("v1/person")
    public PersonV1 getFirstVersionOfPerson()
    {
        return new PersonV1("Shreya Jain");
    }
    //version2
    @GetMapping("v2/person")
    public PersonV2 getSecondVersionOfPerson()
    {
        return new PersonV2(new Name("Shreya","Jain"));
    }


    //Versioning with request parameter
    @GetMapping(path= "/person",params = "version=1")
    public PersonV1 getFirstVersionOfPersonRequestParameter()
    {
        return new PersonV1("Shreya Jain");
    }
    @GetMapping(path = "/person", params = "version=2")
    public PersonV2 getSecondVersionOfPersonRequestParameter()
    {
        return new PersonV2(new Name("Shreya","Jain"));
    }

    //Versioning with Custom Header
    @GetMapping(path = "/person/header", headers = "X-API-KEY=1")
    public PersonV1 getfirstVersionOfCustomHeader()
    {
        return new PersonV1("Shreya Jain");
    }
    @GetMapping(path = "person/header", headers = "X-API-KEY=2")
    public PersonV2 getSecondVersionOfCustomHeader()
    {
        return new PersonV2(new Name("Shreya","Jain"));
    }

    //Versioning with Media
    @GetMapping(path="/person/accept",produces = "application/vnd.company.app-v1+json")
    public PersonV1 getfirstVersionOfAcceptHeader()
    {
        return new PersonV1("Shreya Jain");
    }
    @GetMapping(path="/person/accept",produces = "application/vnd.company.app-v2+json")
    public PersonV2 getSecondVersionOfAcceptHeader()
    {
        return new PersonV2(new Name("Shreya","Jain"));
    }




}
