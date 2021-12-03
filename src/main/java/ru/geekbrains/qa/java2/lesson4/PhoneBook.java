package ru.geekbrains.qa.java2.lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public class PhoneBook {
    private final HashMap<String, ArrayList<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phone) {
        String lastNameLowCase = lastName.toLowerCase();
        ArrayList<String> phones = new ArrayList<>();
        if (phoneBook.containsKey(lastNameLowCase)) {
            phones.addAll(phoneBook.get(lastNameLowCase));
        }
        phones.add(phone);
        phoneBook.put(lastNameLowCase, phones);
    }

    public ArrayList<String> get(String lastName) {
        return phoneBook.get(lastName.toLowerCase());
    }
}
