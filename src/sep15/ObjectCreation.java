package sep15;
/*
Inside the same java class we can have multiple classes, but only one public Class
When we are using public class, the class name and file name should be same.

Class--> It is a blueprint of attributes and behavior
Here we can refer to the attributes as data members like variables
Here we refer to the behavior as the methods present in the class
The sole purpose of the class is to create an instance/ object of it

*/

import javax.naming.Name;

class Names{
    String fName;
    String lName;
    String mName;
    public void display(){
        System.out.println("First Name is: "+fName);
        System.out.println("Last Name is: "+lName);
        System.out.println("Middle Name is: "+mName);
    }
}
public class ObjectCreation {
    public static void main(String[] args) {
        /*
        Syntax of creating an object:
        ```ClassName objName = new ClassName()```

        -Here objName can be anything of your choice, but it should follow the rules used to declare the variables
        -The object creation will happen with the help of "new" keyword
        -There can be multiple objects for a class for different purposes
        -"new" keyword creates a replica/ photocopy of the class without affecting the original behavior
        -Objects are created in the heap memory

        Java Virtual Machine:
        -JVM has something called Java Memory where it stores everything
        -Java memory is divided into 2 parts:
            1. Stack
            2. Heap
        -Stack is where the original code is stored
        -Heap is where objects are stored
         */

        //Creating a reference of the class/ Creating an instance of the class
        Names n1 = new Names();

        //With the help of object reference, we can access the variables and methods present inside the class
        n1.fName="Automation";
        n1.mName="Testing";
        n1.lName="Amazing";

        n1.display();

    }
}
