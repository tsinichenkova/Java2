package ru.geekbrains.qa.java2.lesson1.team;

public class Participant {
    private final String name;
    private final int maxHeight;
    private final int maxRunDistance;
    private final int maxSwimDistance;
    private boolean isPassed;

    public Participant(String name, Integer maxHeight, Integer maxRunDistance, Integer maxSwimDistance) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.isPassed = true;
    }

    public boolean isPassed() {
        return isPassed;
    }

    public void jump (int height) {
        if (height <= maxHeight) {
            System.out.printf("%s успешно прыгнул на %d метров\n", name, height);
        } else {
            System.out.printf("%s не смог прыгнуть на %d метров, максимально может прыгнуть на %d метра\n", name, height, maxHeight);
            this.isPassed = false;
        }
    }

    public void run (int distance) {
        if (distance <= maxRunDistance) {
            System.out.printf("%s успешно пробежал %d метров\n", name, distance);
        } else {
            System.out.printf("%s не смог пробежать %d метров, максимально может пробежать %d метров\n", name, distance, maxRunDistance);
            this.isPassed = false;
        }
    }

    public void swim (int distance) {
        if (distance <= maxSwimDistance) {
            System.out.printf("%s успешно проплыл %d метров\n", name, distance);
        } else {
            System.out.printf("%s не смог проплыть %d метров, максимально может проплыть %d метров\n", name, distance, maxSwimDistance);
            this.isPassed = false;
        }
    }

    @Override
    public String toString() {
        return name + (isPassed() ? " успешно прошел препятствия" : " не смог пройти все препятствия");
    }
}
