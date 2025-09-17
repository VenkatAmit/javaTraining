package sep17;

/*
Constructor is a specialized form of a setter
Constructor is a special method that gets triggered during Object creation
Constructor need not be called explicitly
Constructor does not have any return type
For every object we create internally a constructor is created
We can use constructors while we are setting up an object (Obj creation); it will be replacing conventional setters
All the Constructors are methods but not all methods are not constructors
For any class we have one default constructor, and multiple Parameterized constructors
*/

class Players
{
    private String playerName;
    private String country;

    /*
    Syntax of a default constructor:
    accessModifier ClassName()
    {
        Block of code to be executed
    }
     */

    //Java will have this default constructor beforehand while creating any object

//    public Players()
//    {
//
//    }

    //Default Constructor:
    public Players()
    {
        System.out.println("Default Constructor Called");
        playerName = "Ronaldo";
        country = "Portugal";

    }

    /*
        Parameterized Constructor: Which accepts the arguments or parameters

        accessModifier ClassName()
        {
            Block of code to be executed
        }

        Note: Default and Parameterized constructors in the same class constitute to Constructor Overloading
        When 2 or more constructors are having the same name, but different use cases then it is said to be Constructor Overloading
    */
    public Players(String pName, String pCountry)
    {
        playerName = pName;
        country = pCountry;
    }

    public Players(String pName)
    {
        playerName = pName;
        country = "India";
    }

    public Players(String firstName, String lastName, String pCountry)
    {
        playerName = firstName+" "+lastName;
        country = pCountry;
    }


    public void displayPlayerDetails()
    {
        System.out.println("Player Name is: "+playerName+" and he plays for: "+country);
    }

    public static void displayStaticMethod()
    {
        System.out.println("Static Method Called");
    }
}
public class ConstructorConcepts
{
    public static void main(String[] args)
    {
        Players p1 = new Players();
        p1.displayPlayerDetails();

        //While creating the object we are passing the parameters
        //We are passing the data that requires to be assigned
        Players p2 = new Players("Messi","Argentina");
        p2.displayPlayerDetails();

        Players p3 = new Players("Virat Kohli");
        p3.displayPlayerDetails();

        Players p4 = new Players("Sachin","Tendulkar","India");
        p4.displayPlayerDetails();

        //Calling Static Methods
        Players.displayStaticMethod();

    }
}
