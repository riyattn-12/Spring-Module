package com.example.Rest_Api_Part2.HateOas;

import com.example.Rest_Api_Part2.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
public class UserController
{
    @Autowired
    private UserServiceImpl service;

    public UserController(UserServiceImpl service)
    {
        this.service = service;
    }
    @GetMapping("/users")
    public List<UserModel> findAllUser()
    {
        return service.getAllUser();
    }

    @GetMapping("/users/{id}")
    public EntityModel<UserModel> retrieveUser(@PathVariable int id)
    {
        UserModel userModel= service.getUserById(id);
        EntityModel<UserModel> entityModel=EntityModel.of(userModel);

        //webmvc used to create link pointing to controller method.
        WebMvcLinkBuilder link=WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).findAllUser());
        entityModel.add(link.withRel("all-users"));
        return entityModel;


    }
    @PostMapping("/users")
    public UserModel createUser(@RequestBody UserModel userModel)
    {
        return service.addNewUser(userModel);
    }
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id)
    {
        service.removeUserById(id);
    }
}
