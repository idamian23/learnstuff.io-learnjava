package io.learnstuff.assignment2.exercise1utils;

public final class Truck extends Vehicle implements VehicleInterface{

    public Truck(String model, int year, int numWheels, int maxSpeed,int maxTransportCapacity, String plateNumber) {
        super(model, year, numWheels, maxSpeed, maxTransportCapacity, plateNumber);
    }


    @Override
    public void start() {
        System.out.println("The TRUCK is starting now!");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the TRUCK now!");
    }
}
