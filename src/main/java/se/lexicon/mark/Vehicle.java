package se.lexicon.mark;


/*
Write a program in which you will define class named Vehicle with the associated properties.
After that define classes Car, Motor and Truck which will derive properties from class Vehicle
and have their own properties. Make function Drive which should be override in child classes.
After that make instances of the classes and call function Drive for every class
*/
public class Vehicle {
    private String name;
    private String size;

    // properties with speed and direction
    private int currentVelocity;
    private int currentDirection;

// Constructor
    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        //Create new instance of a vehicle
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }
    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): steering at " + currentDirection + " degrees.");

    }
    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);

    }
    //Getters
    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return this.currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
    public void drive(int speed){
        this.currentVelocity = speed;
    }

    public void stop() {
        this.currentVelocity = 0;
    }
}
