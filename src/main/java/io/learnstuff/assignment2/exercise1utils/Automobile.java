package io.learnstuff.assignment2.exercise1utils;

public final class Automobile extends Vehicle implements VehicleInterface{

    public Automobile(String model, int year, int numWheels, int maxSpeed, String plateNumber) {
        super(model, year, numWheels, maxSpeed, plateNumber);
    }

    @Override
    public void start() {
        System.out.println("Starting the engine for Automobile...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the engine for Automobile...");
    }
}
