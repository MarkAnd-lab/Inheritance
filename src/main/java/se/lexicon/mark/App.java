package se.lexicon.mark;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println("Vehicle!");
//Make instances of the classes and call function Drive for every class

        Car car = new Car("Volvo", "V50",4,5, 6,true);
        car.drive(50);

        Motor motor = new Motor("Ducati","V8",2,0,6, false);
        motor.drive(100);

        Truck truck = new Truck("Mercedes","V10",10,2,6,false);
        truck.drive(200);


    }
}
