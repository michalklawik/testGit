package com.mycompany.app;

public class App
{
    public static void main( String[] args )
    {
        User user1 = new User("Adam", "Kowalski");
        Users users = new Users();

        users.addUser(user1);

        users.printUsers();
    }
}
