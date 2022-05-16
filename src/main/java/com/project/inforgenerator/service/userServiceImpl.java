package com.project.inforgenerator.service;
import com.project.inforgenerator.entities.users;
import org.springframework.stereotype.Service;

import java.util.*;
@Service
public class userServiceImpl implements userService{
    List<users> list;
    public userServiceImpl(){
        list= new ArrayList<>();
        list.add(new users(23,"hareesh.kumar@nskhub.com","hal"));
        list.add(new users(2,"gamanm2001@gmail.com","234"));
    }
    public List<users> getUsers()
    {
        return list;
    }
    public users getUser(long userId)
    {
        users u=null;
        for(users it:list)
        {
            if(it.getId()==userId)
            {
                u=it;
                break;
            }
        }
        return u;
    }
    public users addUser(users user)
    {
        this.list.add(user);
        return user;
    }

}
