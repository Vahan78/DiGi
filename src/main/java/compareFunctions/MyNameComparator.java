package main.java.compareFunctions;

import main.java.model.Human;

public class MyNameComparator extends MyComparator<Human> {
    @Override
    public int myCompareWhit(Human first, Human second) {
        int result = first.getName().compareTo(second.getName());
        int t = 0;

        if (result > 0) {
            t = 1;
        }
        if (result < 0) {
            t = -1;
        }
        return t;

    }
}
