package io.learnstuff.assignment2.exercise1utils;

public class FlyingAutomobile extends Vehicle implements VehicleInterface, FlyingInterface{

    public FlyingAutomobile(String model, int year, int numWheels, int maxSpeed, String plateNumber, int maxFlyingSpeed) {
        super(model, year, numWheels, maxSpeed, plateNumber, maxFlyingSpeed);
    }

    @Override
    public void start() {
        System.out.println("Flying car has started...");
    }

    @Override
    public void stop() {
        System.out.println("Flying car has stopped...");
    }

    @Override
    public void fly() {
        System.out.println("The car has been set for flying! ");
    }
}
