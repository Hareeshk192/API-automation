package com.project.inforgenerator.service;
import com.project.inforgenerator.entities.users;

import java.util.List;

public interface userService {
    public List<users>  getUsers();
    public users getUser(long userId);
    public users addUser(users user);
}
