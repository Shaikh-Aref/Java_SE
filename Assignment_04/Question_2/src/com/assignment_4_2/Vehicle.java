package com.assignment_4_2;

public class Vehicle {
    private String make;
    private String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void drive() {
        System.out.println("Driving " + make + " " + model);
    }

    public void drive(int distance) {
        System.out.println("Driving " + make + " " + model + " for " + distance + " miles");
    }

    public void drive(int distance, int speed) {
        System.out.println("Driving " + make + " " + model + " for " + distance + " miles at " + speed + " mph");
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle("Toyota", "Camry");
        car.drive();
        car.drive(50);
        car.drive(100, 60);
    }
}
