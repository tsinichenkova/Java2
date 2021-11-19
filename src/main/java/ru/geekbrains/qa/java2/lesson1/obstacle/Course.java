package ru.geekbrains.qa.java2.lesson1.obstacle;

import ru.geekbrains.qa.java2.lesson1.team.Team;

public class Course {
    private final Obstacle[] obstacles;

    public Course(Obstacle[] obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt (Team team) {
        for (Obstacle obstacle: obstacles) {
            team.doIt(obstacle);
        }
    }
}
