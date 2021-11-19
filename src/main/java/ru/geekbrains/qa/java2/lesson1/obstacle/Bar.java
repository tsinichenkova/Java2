package ru.geekbrains.qa.java2.lesson1.obstacle;

import ru.geekbrains.qa.java2.lesson1.team.Participant;

public class Bar extends Obstacle{
    private final int height;

    public Bar(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participant participant) {
        participant.jump(height);
    }
}
