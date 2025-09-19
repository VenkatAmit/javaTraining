package sep19;

public class Toyota extends Car {
//if the parent class is having public access modifier, then the overriding method should have public access modifier
    //If any other accessModifiers such as private/default/protected are used then it throws a compilation error

    @Override
    public void accelerate(){
        System.out.println("Accelerating the car");
    }

    //if the parent method is having default access modifier, then the overriding method can have default/protected/public access modifier
    @Override
    protected void applyBrakes(){
        System.out.println("Applying Brakes");
    }

    //Private methods, variables will never participate in inheritance
    private void checkSpeed(){
        System.out.println("Checking Speed");
    }

    //If the parent method is having protected access modifier, then the overriding method can have protected/public access modifier
    @Override
    protected void changeGears() {
        System.out.println("Changing Gears");
    }
}
