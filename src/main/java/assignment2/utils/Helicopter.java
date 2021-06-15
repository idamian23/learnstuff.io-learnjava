package assignment2.utils;

public class Helicopter extends Vehicle{
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
}
