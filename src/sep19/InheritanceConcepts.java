package sep19;

/*
Inheriting the characteristics of the parent class
We inherit the variables, methods, and constructors
extends object --> Every Class will inherit from object class
        toString();
        notify();
        notifyAll();
All the above methods are inherited from object class directly
Inheritance is part of every class
Method Overriding can also be called as Polymorphism --> Applicable for Inheritance
Method Overloading is also referred to as compile time polymorphism
*/
class ParentClass
{
    public ParentClass(){
        System.out.println("Calling the Parent CLass constructor");
        System.out.println("*************************************");
    }
    void display(){

        System.out.println("Display method form the parent class");
        System.out.println("*************************************");
    }

    void performOperation(){
        System.out.println("Performing operation from the parent class");
        System.out.println("*************************************");
    }
}

//extends is the keyword that is used to inherit the data from the parent class
//There should be only one Parent class but there can be n number (multiple) of Child Class
//In JAVA only one class can be inherited
class ChildClass extends ParentClass {
    /*
    Note: super keyword is used to refer to the parent class --> methods, variable, constructors
    super() will be the first line of code in any constructor
    public ChilClass()
    {
        super(); --> Referring to the parent class
    }

     */

    void printValues()

    {
        super.display(); //Referring to the display method in the parent class
        //Here the super keyword is used to access the methods present in the parent class
        System.out.println("Display Method from Child class");
        System.out.println("*************************************");
    }

    //Method Overriding --> When 2 or methods are having the same name and same set of arguments in Parent and Child Class
    //Then the method present in the Child Class will take precedence over the method present in the parent class

    @Override // This annotation checks whether we are overriding a method or not
    void performOperation(){
        super.performOperation(); //Refers to the method in the parent class
        System.out.println("Performing operation from the child class");
        System.out.println("*************************************");
    }

}
public class InheritanceConcepts {
    public static void main(String[] args) {
        ChildClass c1 = new ChildClass();
        c1.display(); //Inheritance Method
        c1.printValues();//Specialized Method: If we are referring to a method that is present in the child class only
        c1.performOperation();

    }
}
