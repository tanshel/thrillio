package com.company.thrillio.dao;

import com.company.thrillio.DataStore;
import com.company.thrillio.entities.User;

public class UserDao {
    public User[] getUsers() {
        return DataStore.getUsers();
    }
}
