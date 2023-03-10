package main.java.model;


import main.java.compareFunctions.MyComparable;

import static main.java.Main.comparing;

public class Human extends MyComparable<Human> {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" + name + "," + age + "}";
    }

    //  use this function if You have compare two object ages...
    //  @Override
    //    public int myCompareTo(Human second) {
    //        return comparing(this.age - second.age);
    //    }

    // and use this one function if You have compare two objects name.
    @Override
    public int myCompareTo(Human second) {
        int result = this.getName().compareTo(second.getName());
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