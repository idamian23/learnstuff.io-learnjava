package io.learnstuff.assignment2.exercise1utils;


public class Vehicle implements VehicleInterface {

    private String model;
    private int year;
    private int numWheels;
    private int maxSpeed;
    private int maxFlyingSpeed;
    private int mileage;
    private String plateNumber;
    private int maxTransportCapacity;

    public int getMaxTransportCapacity() {
        return maxTransportCapacity;
    }

    public void setMaxTransportCapacity(int maxTransportCapacity) {
        this.maxTransportCapacity = maxTransportCapacity;
    }

    // Constructor for Automobiles
    public Vehicle(String model, int year, int numWheels, int maxSpeed, String plateNumber) {
        this.model = model;
        this.year = year;
        this.numWheels = numWheels;
        this.maxSpeed = maxSpeed;
        this.plateNumber = plateNumber;
    }
    public Vehicle(String model, int year, int numWheels, int maxSpeed, String plateNumber, int maxFlyingSpeed) {
        this.model = model;
        this.year = year;
        this.numWheels = numWheels;
        this.maxSpeed = maxSpeed;
        this.plateNumber = plateNumber;
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    // TRUCK
    public Vehicle(String model, int year, int numWheels, int maxSpeed,int maxTransportCapacity, String plateNumber){
        this.model = model;
        this.year = year;
        this.numWheels = numWheels;
        this.maxSpeed = maxSpeed;
        this.plateNumber = plateNumber;
        this.maxTransportCapacity = maxTransportCapacity;
    }


    //Constructor for Flying Vehicles
    public Vehicle(String model, int year, int numWheels, int maxFlyingSpeed) {
        this.model = model;
        this.year = year;
        this.numWheels = numWheels;
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int newMileage) {
        if (newMileage < this.mileage) {
            throw new IllegalArgumentException();
        }
        this.mileage = newMileage;
    }

    public int getMaxFlyingSpeed() {
        return maxFlyingSpeed;
    }

    public void setMaxFlyingSpeed(int maxFlyingSpeed) {
        this.maxFlyingSpeed = maxFlyingSpeed;
    }

    public String toString(){
        String str = this.model + "-" + this.plateNumber;
        return str;
    }

    @Override
    public void start() {
        System.out.println("Starting the engine...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the engine...");
    }
}
