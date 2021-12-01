package ru.geekbrains.qa.java2.lesson3;

public class Homework2 {

    private static final Box<Apple> appleBox = new Box<>();
    private static final Box<Apple> appleBox2 = new Box<>();
    private static final Box<Apple> appleBox3 = new Box<>();
    private static final Box<Orange> orangeBox = new Box<>();
    private static final Box<Orange> orangeBox2 = new Box<>();

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            appleBox.add(new Apple());
            orangeBox.add(new Orange());
        }

        for (int i = 0; i < 10; i++) {
            appleBox2.add(new Apple());
            orangeBox2.add(new Orange());
        }

        for (int i = 0; i < 14; i++) {
            appleBox3.add(new Apple());
        }

        printBoxesInfo();
        appleBox.pourOverBox(appleBox2);
        orangeBox.pourOverBox(orangeBox2);
        printBoxesInfo();
    }

    private static void printBoxesInfo() {
        System.out.printf("Вес 1 коробки с яблоками: %d грамм\n", appleBox.getWeight());
        System.out.printf("Вес 2 коробки с яблоками: %d грамм\n", appleBox2.getWeight());
        System.out.printf("Вес 3 коробки с яблоками: %d грамм\n", appleBox3.getWeight());
        System.out.printf("Вес 1 коробки с апельсинами: %d грамм\n", orangeBox.getWeight());
        System.out.printf("Вес 2 коробки с апельсинами: %d грамм\n", orangeBox2.getWeight());

        System.out.printf("1 коробка с яблоками равна 1 коробке с апельсинами: %b\n", appleBox.compare(orangeBox));
        System.out.printf("3 коробка с яблоками равна 2 коробке с апельсинами: %b\n", appleBox3.compare(orangeBox2));
        System.out.println("-------------------------------------------");
    }


}
