package sep19;

public class Toyota extends Car {
//If the parent class is having public access modifier, then the overriding method should have public access modifier
    //If any other accessModifiers such as private/default/protected are used then it throws a compilation error

    // Variable Shadowing --> Here we are hiding the variable that is present in the parent class (Car)
    int a = 90; //Variable Shadowing


    @Override
    public void accelerate(){
        System.out.println("Accelerating the car");
    }

    //if the parent method is having default access modifier,
    //then the overriding method can have default/protected/public access modifier
    @Override
    protected void applyBrakes(){
        System.out.println("Applying Brakes");
    }

    //Private methods, variables will never participate in inheritance
    private void checkSpeed(){
        System.out.println("Checking Speed");
    }

    //If the parent method is having protected access modifier,
    //then the overriding method can have protected/public access modifier
    @Override
    protected void changeGears() {
        System.out.println("Changing Gears");
    }

    //Static methods are never overridden, they are hidden
    //Method Hiding --> When the same static method is present in both the parent and child,
    //then the method in the child class is executed,
    //Thereby hiding the static method in the parent class
    public static void paintCars(){
        //super() keyword is not applicable for static methods
        Car.paintCars(); //Refer to the static method in parent class
        System.out.println("Paint cars in green");
    }
}
