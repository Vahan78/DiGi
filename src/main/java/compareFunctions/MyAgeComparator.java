package main.java.compareFunctions;

import main.java.model.Human;

import static main.java.Main.comparing;

public class MyAgeComparator extends MyComparator<Human> {

    @Override
    public int myCompareWhit(Human first, Human second) {

        return comparing(first.getAge()- second.getAge());
    }
}
