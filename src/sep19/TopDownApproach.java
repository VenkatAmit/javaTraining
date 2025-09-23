package sep19;

import sep19.subpackage.MercedesBenz;

public class TopDownApproach {
    public static void main(String[] args) {

        /*
        Parent Object can access the child objets --> Top-Down Approach
        Top-Down Approach also comes under Polymorphism concept
        Here MercedesBenz is inheriting from the Car Class
        In a Topdown approach we can access the methods present in the parent class and,
        we can also access the overridden methods in the child class
        However, we can not access specialized methods in the child class
        */

        Car c1 = new MercedesBenz();

        c1.applyBrakes();
        c1.accelerate(); //Parent Class method
        c1.changeGears(); //Overridden method
        c1.startEngine(); //Parent Class method
        c1.stopEngine();

        c1 = new Toyota();

        System.out.println(c1.a); // Refers to the variable in the parent class --> Variable Shadowing

        c1.applyBrakes();//Overridden method
        c1.accelerate();//Overridden method

    }
}