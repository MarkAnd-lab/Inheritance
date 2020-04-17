package se.lexicon.mark;

public class Motor extends Vehicle {
    private int wheels;
    private int gears;
    private boolean isManual;

    private  int currentGear;

    //Constructor
    public Motor(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    //Setter for CurrentGear change to changeGear
    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }
    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car.changeVelocity() : Velocity " + speed + " direction " + direction);
    }

    @Override
    public void drive(int speed) {
        super.drive(speed);
        System.out.println("Motorcycle current speed: "+ getCurrentVelocity());
    }

}
