package org.example.Entity;

public class Scooter  extends Car{
    public Scooter(String model, String colour, int maxSpeed) {
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
        System.out.println("  Is on repair  " + getModel());

        }
    }