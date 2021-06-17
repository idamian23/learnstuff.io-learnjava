package io.learnstuff.assignment2;

import io.learnstuff.assignment2.exercise1utils.*;

/*****************************
 Write classes that describe types of vehicles, starting from a base class and extending it

 Write at least two interfaces that reinforce specific behavior for any vehicle and make sure
 the classes you describe implement the interfaces

 Use the interfaces and the base class as types (polymorphism) and write  a program that executes
 various action on vehicle instances.
 ******************************/

public class Exercise1 {
    public static void main(String ...arg) {
        Vehicle vehicle = new Vehicle("M", 2000, 4, 200, "NT-12-TRA");
        Automobile automobile = new Automobile("BMW", 1980, 4, 180, "B-222-MMM");
        Helicopter helicopter = new Helicopter("Tiger", 2010, 10000, 120);
        Truck truck = new Truck("Volvo", 2020, 6, 90, 800, "B-89-LUO");
        FlyingAutomobile flyingAutomobile = new FlyingAutomobile("NewModel",2021,6, 200,"B-222-OZN",10000);

        System.out.println(truck.getMaxTransportCapacity());

        vehicle.start();
        automobile.start();
        truck.stop();
        helicopter.fly();
        flyingAutomobile.start();
        flyingAutomobile.fly();
        flyingAutomobile.stop();
    }
}
