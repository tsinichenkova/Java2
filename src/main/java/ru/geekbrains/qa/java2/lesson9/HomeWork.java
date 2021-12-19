package ru.geekbrains.qa.java2.lesson9;

import java.util.List;
import java.util.stream.Collectors;

public class HomeWork {

    public static void main(String[] args) {

    }

    /*
    Написать функцию, принимающую список Student
    и возвращающую список уникальных курсов,
    на которые подписаны студенты.
    */

    static List<Course> uniqCourses(List<Student> students) {
        return students.stream()
                .map(Student::getAllCourses)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    /*
    Написать функцию, принимающую на вход список Student
    и возвращающую список из трех самых любознательных
    (любознательность определяется количеством курсов).
    */

    static List<Student> getThreeCuriosStudents(List<Student> students) {
        return students.stream()
                .sorted((s1, s2) -> s2.getAllCourses().size() - s1.getAllCourses().size())
                .limit(3)
                .collect(Collectors.toList());
    }

    /*
    Написать функцию, принимающую на вход список Student
    и экземпляр Course, возвращающую список студентов,
    которые посещают этот курс.
    */

    static List<Student> getStudentsInCourses(List<Student> students, Course course) {
        return students.stream()
                .filter(s -> s.getAllCourses().contains(course))
                .collect(Collectors.toList());
    }
}
