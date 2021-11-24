package ru.geekbrains.qa.java2.lesson1;

import ru.geekbrains.qa.java2.lesson1.obstacle.*;
import ru.geekbrains.qa.java2.lesson1.team.Participant;
import ru.geekbrains.qa.java2.lesson1.team.Team;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Obstacle[] obstacles = prepareObstacles();
        Participant[] participantsDogs = prepareParticipants("Песик ", 4);
        Participant[] participantsCats = prepareParticipants("Котик ", 4);

        Course c = new Course(obstacles);
        Team teamDogs = new Team("Морские песики", participantsDogs);
        Team teamCats = new Team("Морские котики", participantsCats);
        doIt(c, teamDogs);
        doIt(c, teamCats);
    }

    private static void doIt(Course c, Team team) {
        c.doIt(team);
        team.showResults();
        team.showPassedParticipants();
        System.out.println(team);
    }

    private static Obstacle[] prepareObstacles() {
        Obstacle bar = new Bar(5);
        Obstacle run = new Run(60);
        Obstacle swim = new Swim(30);
        return new Obstacle[]{bar, run, swim};
    }

    private static Participant[] prepareParticipants(String name, int count) {
        Participant[] participants = new Participant[count];
        for (int i = 0; i < participants.length; i++) {
            participants[i] = new Participant(name + (i + 1), getRandomNumber(15), getRandomNumber(200), getRandomNumber(150));
        }
        return participants;
    }

    private static int getRandomNumber (int bound) {
        Random rand = new Random();
        return rand.nextInt(bound) + 1;
    }
}
