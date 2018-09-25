package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Users {

    List<User> users = new ArrayList<>();

    public void addUser(User user) {
        this.users.add(user);
    }

    public int getUsersNumber(){
        return users.size();
    }

    public void printUsers() {
        System.out.println(this.users);
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users1 = (Users) o;
        return Objects.equals(users, users1.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }

    @Override
    public String toString() {
        return "Users{" +
                "users=" + users +
                '}';
    }
}
