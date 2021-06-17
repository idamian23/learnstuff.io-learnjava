package io.learnstuff.assignment2.exercise2utils;

public abstract class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    public abstract void introduceYourself();

    public abstract void nameYourJob();

    //getter
    public String getName() {
        return name;
    }
}