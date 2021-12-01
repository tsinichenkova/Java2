package ru.geekbrains.qa.java2.lesson4;

public class HomeWork2 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "8-919-333-44-55");
        phoneBook.add("иванов", "8-911-111-44-44");
        phoneBook.add("Иванов", "8-912-555-12-66");
        phoneBook.add("сидоров", "8-914-999-12-11");
        phoneBook.add("Петров", "8-911-333-44-99");
        phoneBook.add("Сидоров", "8-914-555-12-22");

        System.out.println(phoneBook.get("Иванов"));
        System.out.println(phoneBook.get("Сидоров"));
        System.out.println(phoneBook.get("петров"));
    }
}
