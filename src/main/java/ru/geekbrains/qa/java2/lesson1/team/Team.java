package ru.geekbrains.qa.java2.lesson1.team;

import ru.geekbrains.qa.java2.lesson1.obstacle.Obstacle;

public class Team {
    private final String name;
    private final Participant[] participants;
    private boolean isPassed;

    public Team(String name, Participant[] participants) {
        this.name = name;
        this.participants = participants;
        this.isPassed = true;
    }

    @Override
    public String toString() {
        return "\nКоманада " + name + (isPassed ? " успешно прошла препятствия" : " не смогла пройти все препятствия\n");
    }

    public void showPassedParticipants() {
        System.out.println("-------------------------------");
        for (Participant participant : participants) {
            if (participant.isPassed()) {
                System.out.println(participant);
            }
        }
    }

    public void showResults() {
        System.out.println("-------------------------------");
        for (Participant participant : participants) {
            System.out.println(participant);
        }
    }

    public void doIt(Obstacle obstacle) {
        for (Participant participant : participants) {
            obstacle.doIt(participant);
            if (!participant.isPassed()) {
                this.isPassed = false;
            }
        }
    }
}
