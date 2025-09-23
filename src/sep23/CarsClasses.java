package sep23;
/*
Abstract classes ensures that we can have methods and have no logic in them
Abstract classes, does not support the object creation
Abstract Classes does support both abstract and concrete methods in the same class
Abstract classes can be used only via Inheritance
Abstract Variables are not possible in JAVA, only abstract class and abstract methods
We can have the constructors inside an abstract class, but the child classes also need to implement the constructors
In the Child class we need to implement the logic for all the abstract methods in the parent class
*/
public abstract class CarsClasses {

    public abstract void startEngine();
//    {
//        System.out.println("Starting the ne Engine");
//    }

    public abstract void stopEngine();
//    {
//        System.out.println("Stopping the Engine");
//    }

    public abstract void applyBrakes();
//    {
//        System.out.println("Applying New Brakes");
//    }

    public abstract void accelerate();
//    {
//        System.out.println("Accelerating the Car");
//    }
}
