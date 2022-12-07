package Notes;

public class Car {
    // in this example, hypothetically writing an app for car videogame

    // All cars are going to share some properties in our code
    public String owner;
    public int gas;
    public static int count; //anytime you see the static keyword in a class know that the field is
    // shared across all objects of that clas


    // All classes have a special method (methods are repeatable code) that handles 
    // creating an objects of the class. This is called instantation.

    //creating a constructor to set an initial value of the owner field when a car is 
    //created
    public Car(String startingOwner, int startingGas) {
        this.owner = startingOwner; //"this" is a reference to the current object (the obj being created
        this.gas = startingGas;
        count++;

    }

    //the default constructor must be defined when creating new constructors such as the above. 
    public Car(){
        count++;
    }

    //you can multiple main methods throughout classes, only the class that you run it in will actually execute
    public static void main(String[] args) {

        Car.checkCount(); //this should say 0 because no cars have been made at this point 
        // (notice we use the car name in the dot notation to reference the count var)

        Car myCar = new Car();

        myCar.owner = "Abraham"; //manually set the value of the state var of the obj using dot notation
        System.out.println(myCar.owner); //default value of a String is null, if not set

        //A constructor has 
        Car mattDamonCar = new Car("Matt Damon", 100);

        System.out.println(mattDamonCar.owner);

        // in order to call the method, you must create an object to reference the method

        mattDamonCar.drive();

        System.out.println(mattDamonCar.gas); //in our drive method we reduced the gas state var from 100 to 90

        Car.checkCount();
    }

    //usually when people create a method in the same class they put the main method in
    //they would put it under

    //this method has an access modifier, return type and name 
    //public: method can be called by any object anywhere in our code
    //void: return type, in this case, this method will not return a value of any type
    //drive: the name of our method, should be named something informative and be written in camelCase
    public void drive() {
        System.out.println("vroom vroom!");
        this.gas -= 10;
    }

    //static method means we must use the class name to invoke this method
    public static void checkCount() {
        System.out.println("there are this many cars made: " + count);
    }


}
