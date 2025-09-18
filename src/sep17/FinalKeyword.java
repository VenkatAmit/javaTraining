package sep17;

//If we are using final keyword at class level we can create objects but we can not use it for inheritance
final class Dummy{

    /*
    final keyword can not be used at constructor level
    final public Dummy(){

    }
    If we are using final keyword at a method level, we can access the methods
    But we can not override the methods via inheritance
    */

    public final void performDisplay(String name, String lName)
    {
        System.out.println(name+" "+lName);
    }
}
public class FinalKeyword {
    public static void main(String[] args) {
        //When we declare the variable as final, that means we can't modify the value of that variable
        final int a = 10;

        System.out.println(a);

        //a=60; //Throws compilation error as reassignment cannot be done for the final variable

        Dummy d = new Dummy();
        System.out.println(d);

    }
}
