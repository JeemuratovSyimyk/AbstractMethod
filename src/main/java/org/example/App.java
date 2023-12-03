package org.example;

import org.example.Entity.Airplane;
import org.example.Entity.Car;
import org.example.Entity.Scooter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Airplane airplane = new Airplane("Airbus", "Blue", 1500);
        Airplane airplane1 = new Airplane("Rox", "Yellow", 1600);


        Scooter scooter = new Scooter("Honda", "White", 20);
        Scooter scooter1 = new Scooter("TVS", "Black", 40);

        Car[] cars = {airplane, airplane1, scooter, scooter1};
        for (Car car1 : cars) {
            car1.gas();
            car1.brake();
        }
    }
}
