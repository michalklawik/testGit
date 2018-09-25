package com.mycompany.app;

import java.util.Map;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Users users = new Users();
        program: while (true) {
            UserInterface.printMenu();
            Scanner getSelection = new Scanner(System.in);
            switch (getSelection.next()) {
                case "1":
                    Map<String, String> userInfo = UserInterface.getUserInfo();
                    users.addUser(new User(users.getUsersNumber() + 1, userInfo.get("name"), userInfo.get("surName")));
                    break;
                case "2":
                    users.printUsers();
                    break;
                case "exit":
                    break program;
                default:
                    System.exit(1);
                    break;
            }
        }
    }
}
