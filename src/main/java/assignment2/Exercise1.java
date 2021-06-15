package assignment2;

import assignment2.utils.Automobile;
import assignment2.utils.Helicopter;
import assignment2.utils.Truck;
import assignment2.utils.Vehicle;

/*****************************
 Write classes that describe types of vehicles, starting from a base class and extending it

 Write at least two interfaces that reinforce specific behavior for any vehicle and make sure
 the classes you describe implement the interfaces

 Use the interfaces and the base class as types (polymorphism) and write  a program that executes
 various action on vehicle instances.
 ******************************/

public class Exercise1 {

    Vehicle vehicle = new Vehicle("M",2000,4,200,"NT-12-TRA");
    Automobile automobile = new Automobile("BMW",1980,4,180,"B-222-MMM");
    Helicopter helicopter = new Helicopter("Tiger",2010,10000,120);
    Truck truck = new Truck("Volvo",2020,6,90,80,"B-89-LUO");


}
