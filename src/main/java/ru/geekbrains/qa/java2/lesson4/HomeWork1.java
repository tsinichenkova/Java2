package ru.geekbrains.qa.java2.lesson4;

import java.util.*;

public class HomeWork1 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("one", "two", "two", "three", "three", "three", "four",
                "four", "four", "four", "five", "five", "five", "five", "five", "six", "six", "six", "six", "six", "six"));

        HashMap<String, Integer> uniqWords = new HashMap<>();
        for (String word : words) {
            uniqWords.put(word, uniqWords.getOrDefault(word, 0) + 1);
        }

        System.out.println("Вывести список уникальных слов, из которых состоит массив");
        for (Map.Entry<String, Integer> pair : uniqWords.entrySet()) {
            if (pair.getValue().equals(1)) {
                System.out.println(pair.getKey());
            }
        }

        System.out.println("----------------------------------------------");
        System.out.println("Посчитать, сколько раз встречается каждое слово");
        for (Map.Entry<String, Integer> pair : uniqWords.entrySet()) {
            System.out.println("Количество слов " + pair.getKey() + " равно " + pair.getValue());
        }
    }

}
