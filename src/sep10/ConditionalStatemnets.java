package sep10;

public class ConditionalStatemnets {
    public static void main(String[] args) {
        //Conditional Statement:
        //It is used to check whether a particular condition is satisfied or not
        int a=20;
        //(==) --> Checks if the value present on the left hand is same as the right hand
        if (a==50)
            System.out.println(a);

        //(!=) --> Checks if the LHS value os not equal to RHS value
        if(a!=100)
            System.out.println(a);

        int b=80;
        int c=30;

        //(%) --> Modulus of a number(Remainder)
        if (b%4==0)
            System.out.println(b+" is divisible by 4");

        //(&&) --> Checks the "AND" function
        if (b%5==0 && c%5==0)
            System.out.println(b+" is divisible by 5 and "+c+" is divisible by 5");

        //(||) --> Checks the "OR" conditions
        if (b%5==1 || c%5==0)
            System.out.println(b+" is divisible by 5 and "+c+" is divisible by 5");

        //If & Else statement:
        if ((a+b)/10==9)
            System.out.println("Qoutient is 9");
        else
            System.out.println("Qoutient is "+(a+b)/5);


    }
}
