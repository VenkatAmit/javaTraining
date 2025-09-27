package sep24;
/*
Interface serves as a contract between the client and developer
Client --> is the interface which provides the set of abstract methods
Developer --> Class that implements the logics for all the abstract methods
Interface helps us achieve 100% abstraction till JDK 8
By default all the methods in the interface are public in nature
By Default all the variables in the interface are public, static in nature
We can not create an objects for the interface, neither we can have the constructors for the interface
Interface helps us achieve multiple inheritance with the java classes which provides scope for multiple abstraction
Interface supports runtime polymorphism because we are overriding the methods present in the interface
We can inherit one interface to another interface

Inheritance works between:
Interface --> Interface
Class --> Class
Class --> Interface
Interface --> Class --> is not supported
*/
public interface SampleInterfaces {
    void sample(); //This method is public in nature

}
