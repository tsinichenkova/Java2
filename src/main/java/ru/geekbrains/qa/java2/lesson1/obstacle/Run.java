package ru.geekbrains.qa.java2.lesson1.obstacle;

import ru.geekbrains.qa.java2.lesson1.team.Participant;

public class Run extends Obstacle{
    private final int distance;

    public Run(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Participant participant) {
        participant.run(distance);
    }
}
