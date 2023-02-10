package main.java.model;


public class Human implements Comparable<Human> {
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

    @Override
    // use this function if i want compare humans by age
//    public int compareTo(Human h) {
//        return age - h.age;
//    }

    // and use this function if i want compare humans by name
    public int compareTo(Human h) {
        return name.compareTo(h.name);
    }
}