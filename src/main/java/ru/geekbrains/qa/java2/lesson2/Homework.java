package ru.geekbrains.qa.java2.lesson2;

public class Homework {
    public static void main(String[] args) {
        String[][] array1 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] array2 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "s", "3", "4"}};
        String[][] array3 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};

        String[][][] arrays = {array1, array2, array3};

        for (String[][] array : arrays) {
            try {
                System.out.println("Сумма массива: " + sumArray(array));
            } catch (MyArraySizeException e) {
                System.out.println("Неверный размер массива");
            } catch (MyArrayDataException e) {
                System.out.println("Ошибка в ячейке: " + e.getI() + ", " + e.getJ());
            }
        }

    }

    private static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
