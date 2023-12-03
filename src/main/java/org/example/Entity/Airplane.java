package org.example.Entity;

public class Airplane extends Car{
    public Airplane(String model, String colour, int maxSpeed) {
        super(model, colour, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println(" This is  "  +getModel()
                + " The color of this " +getColour()
                + " The highest speed " +getMaxSpeed());

    }
    @Override
    public void brake() {
    }
}
