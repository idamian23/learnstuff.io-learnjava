package io.learnstuff.assignment2.exercise3utils;

public class MySqlDatabase implements CRUDInterface  {
    @Override
    public void create() {
        System.out.println("This method creates data on MySQL Database");
    }

    @Override
    public void read() {
        System.out.println("This method reads data on MySQL Database");
    }

    @Override
    public void update() {
        System.out.println("This method updates data on MySQL Database");
    }

    @Override
    public void delete() {
        System.out.println("This method deletes data on MySQL Database");
    }
}
