package io.learnstuff.assignment2.utils;

public class Truck extends Vehicle{
    private int maxTransportCapacity;

    public Truck(String model, int year, int numWheels, int maxSpeed,int maxTransportCapacity, String plateNumber) {
        super(model, year, numWheels, maxSpeed, plateNumber);
    }

    public int getMaxTransportCapacity() {
        return maxTransportCapacity;
    }

    public void setMaxTransportCapacity(int maxTransportCapacity) {
        this.maxTransportCapacity = maxTransportCapacity;
    }
}
