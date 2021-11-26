package ru.geekbrains.qa.java2.lesson3;

import java.util.Arrays;

public class Homework1 {
    public static void main(String[] args) {

        String[] stringArray = {"1", "2", "3"};
        Integer[] intArray = {1, 2, 3};

        System.out.println(Arrays.toString(swapElements(stringArray, 0, 1)));
        System.out.println(Arrays.toString(swapElements(intArray, 1, 2)));

    }

    private static <T> T[] swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }

}
