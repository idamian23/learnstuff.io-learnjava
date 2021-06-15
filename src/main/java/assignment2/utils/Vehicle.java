package assignment2.utils;


public class Vehicle {
    private String model;
    private int year;
    private int numWheels;
    private int maxSpeed;
    private int maxFlyingSpeed;
    private int mileage;
    private String plateNumber;

    // Automobiles
    public Vehicle(String model, int year, int numWheels, int maxSpeed, String plateNumber) {
        this.model = model;
        this.year = year;
        this.numWheels = numWheels;
        this.maxSpeed = maxSpeed;
        this.plateNumber = plateNumber;
    }
    //Flying Vehicles
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
}
