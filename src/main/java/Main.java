package main.java;

import main.java.compareFunctions.MyAgeComparator;
import main.java.model.Human;


public final class Main {
    public static int comparing(int result) {
        int t = 0;

        if (result > 0) {
            t = 1;
        }
        if (result < 0) {
            t = -1;
        }
        return t;
    }
    public static void main(String[] args) {
        Human h1 = new Human("Aram", 25);
        Human h2 = new Human("Mayram", 30);
        Human h3 = new Human("Aramik", 25);



        System.out.println("My " + h2.myCompareTo(h3));

        MyAgeComparator age = new MyAgeComparator();
        System.out.println(age.myCompareWhit(h1, h3));



    }



}


