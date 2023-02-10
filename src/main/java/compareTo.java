package main.java;

import main.java.compareFunctions.AgeComparator;
import main.java.compareFunctions.NameComparator;
import main.java.model.Human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class compareTo<H> {
    public static void main(String[] args) {
        Human h1 = new Human("Aram", 25);
        Human h2 = new Human("Mayram", 35);
        Human h3 = new Human("Zaven", 30);
        List<Human> h = new ArrayList<>();
        h.add(h1);
        h.add(h2);
        h.add(h3);

        Collections.sort(h);
        System.out.println("CompareTo sorting " + h);

        Collections.sort(h,new NameComparator().reversed());
        System.out.println("NameComparator sorting "+ h);

        Collections.sort(h, new AgeComparator());
        System.out.println("AgeComparator sorting " + h);
    }

}


