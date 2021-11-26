package ru.geekbrains.qa.java2.lesson3;

import java.util.ArrayList;

public class Box <T extends Fruit>{
    private final ArrayList<T> list;


    public Box() {
        this.list = new ArrayList<>();
    }

    public ArrayList<T> getList() {
        return list;
    }

    public int getWeight(){
        if (list.size() > 0) {
            return list.size() * list.get(0).getWeight();
        } else {
            return 0;
        }
    }

    public boolean compare (Box <? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

    public void pourOverBox (Box <T> box) {
        box.getList().addAll(list);
        list.clear();

    }

    public void add (T obj) {
        list.add(obj);
    }
}
