package com.mycompany.app;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {

    public static void printMenu() {
        System.out.println("Menu");
        System.out.println("1. Dodaj użytkownika");
        System.out.println("2. Drukuj użytkowników");
    }

    public static Map<String, String> getUserInfo() {
        Map<String, String> userData = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imie: ");
        if (scanner.hasNextLine()) {
            String name = scanner.next();
            userData.put("name", name);
        }

        System.out.println("Podaj nazwisko: ");
        if (scanner.hasNextLine()) {
            userData.put("surName", scanner.next());
        }

        return userData;
    }
}
