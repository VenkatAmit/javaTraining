package sep19.subpackage;

import sep19.Car;
//Ranking od Access Modifiers --> Public > Protected > Default > Private
//Protected access modifier --> Ensures that the methods are visible within the same package and outside the package via inheritance
public class MercedesBenz extends Car {

    //Method does not override because the default methods are accessible within the same package
    //This will be a specialized method not an overriding method
    void applyBrakes(){
        System.out.println("Applying Brakes");
    }

    @Override
    protected void changeGears() {
        super.changeGears();
    }
}
