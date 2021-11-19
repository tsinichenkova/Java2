package ru.geekbrains.qa.java2.lesson1.obstacle;

import ru.geekbrains.qa.java2.lesson1.team.Participant;

public class Swim extends Obstacle{
    private final int distance;

    public Swim(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Participant participant) {
        participant.swim(distance);
    }
}
