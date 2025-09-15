package sep15;

public class MethodDeclarations {
    /*
        Method --> It is used to write a common set of code or the common behavior or the common functionality.
        Method is also referred to as the set of instructions that needs to be executed whenever triggered.

        Syntax of declaring a method:
            ```accessModifier returnType methodName(arguments to be passed)```
        accessModifier --> Defines the scope/ visibility of the method.
        1. public --> Method is accessible anywhere within  the project.
        2. private --> Method is accessible within the class.
        3. protected --> Method is accessible within the package, and can be accessed outside the package via inheritance.
        4. default --> method is accessible within the package.

        returnType --> Output that we are expecting from the method.
        It can be int, float, boolean, char, etc. along with void.
        Void is simply executes the code that is present inside the method without returning anything/ any output.

        methodName is something that we provide, we need to ensure the method name follows the rules used to declare the variables.
        methodName should be readable and understandable.

        arguments to a method is optional

        Inside a static method we can call other static methods or variables
        */
    public static void main(String[] args) {
        int firstNumber=30;
        int secondNumber=60;
        System.out.println(sumOfNumbers(firstNumber, secondNumber));
        display();
        System.out.println(sumOfNumbers(10,30));
        System.out.println(sumOfNumbers(30,20,50));
        System.out.println(sumOfNumbers(10,50.4));
        System.out.println(sumOfNumbers(12.4,40));
        System.out.println(sumOfNumbers(30.6,59.4));
    }

    /*
    In the same class we can't have 2 methods having same name and same set of arguments

    Method Overloading --> Under this we can have 2 methods having same name but different arguments
    Method Overloading is also known as compile tme polymorphism
    Polymorphism --> same thing in multiple forms

    What is the criteria to be followed for different arguments:
    1. Different number of parameters
    2. Different type of parameters
    3. Different order of Parameters

    Return type and access modifier will never participate in method overloading

    Purpose:
    1. Promotes Reusability
    2. Promotes Code Readability


    */

    private static int sumOfNumbers(int a, int b)
    {
        return a+b; // return keyword is used when we are trying to give an output from this method
    }

    private static int sumOfNumbers(int a, int b, int c)
    {
        return a+b+c; // return keyword is used when we are trying to give an output from this method
    }
    //If we do a double with an integer value it will return integer value
    private static double sumOfNumbers(double a, int b)
    {
        return a+b; // return keyword is used when we are trying to give an output from this method
    }

    private static double sumOfNumbers(int a, double b)
    {
        return a+b;// return keyword is used when we are trying to give an output from this method
    }

    private static double sumOfNumbers(double a, double b)
    {
        return a+b; // return keyword is used when we are trying to give an output from this method
    }

    //If no accessModifier is defined then it is referred to as default accessModifier
    static void display()
    {
        System.out.println("Calling Display Method");
    }

    public static void callingPublicMethod(){
        System.out.println("Calling Public Method");
    }

}
