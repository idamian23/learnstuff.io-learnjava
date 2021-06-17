package io.learnstuff.assignment2.utils;

public final class Helicopter extends Vehicle implements FlyingInterface{
    private int maxAltitude;

    public Helicopter(String model, int year,int maxAltitude, int maxFlyingSpeed )
    {
        super(model, year, maxAltitude, maxFlyingSpeed);
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    @Override
    public void fly() {
        System.out.println("Helicopter has been set for flying... ");
    }
}
