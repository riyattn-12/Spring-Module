package com.example.Rest_Api_Part2.HateOas;

//import com.example.Rest_Api_Part2.Entity.UserModel;
//import com.example.Rest_Api_Part2.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl
{
    private static List<UserModel> userList = new ArrayList<>();
    private static int idCount = 0;

    static {
        userList.add(new UserModel(21,"ttn",21,"riya"));
        userList.add(new UserModel(22, "ttn1", ++idCount, "Shreya"));
        userList.add(new UserModel(23, "ttn2", ++idCount, "Himani"));
        userList.add(new UserModel(24, "ttn3", ++idCount, "Supriya"));
    }


    public UserModel addNewUser(UserModel user) {
        user.setUserId(++idCount);
        userList.add(user);
        return user;

    }

    public List<UserModel> getAllUser() {
        return userList;
    }

    public UserModel getUserById(int id)
    {
        return userList.stream().filter(e -> e.getUserId()==id).findFirst().orElse(null);
    }

    public void removeUserById(int id)
    {
        userList= userList.stream().filter(emp-> emp.getUserId()!=id).collect(Collectors.toList());
    }
}




