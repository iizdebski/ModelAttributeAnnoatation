package com.izdebski.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.izdebski.model.User;

@Repository
public class UserDAO {
    private static List<User> list = null;
    static{
        list = new ArrayList<User>();
        list.add(new User("Marek", 30, "kk.cs@gmail.com", "Lithuania"));
        list.add(new User("Martin", 40, "martin.cs@gmail.com", "US"));
        list.add(new User("Pedro", 30, "sean.cs@gmail.com", "Mexico"));
    }
    public List<User> getUserList() {
        return list;
    }
    public void addUser(User user) {
        list.add(user);
    }
}