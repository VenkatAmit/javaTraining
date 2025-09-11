package sep9;

public class VariableConcepts {
    public static void main(String[] args){
        /* Variable --> temporary storage of data
        Rules to be followed while declaring the variable:
        It should start with a small letter
        It should not start with a number or special character
        It should not contain any whitespaces between the variables
        It should not use any JAVA keywords

        Different Data types in JAVA
        Primitive Data type:
        int
        long
        short
        byte
        char
        boolean
        double
        float, etc

        Non-Primitive Data types:
        Strings
        Arrays
        List
        Set, etc

        Syntax followed to declare the variable
        datatype variableName
        Ex:
        int a1; --> accepts a range of values from -2^31 to 2^31-1
        char b2; --> accepts a single value like 'A','s','4','%'
        double c3; --> accepts upto 16 significant digits
        float d4; -->accepts upto 5 significant digits (after the decimal point it will accept upto 5 digits
        byte e5; --> accepts a range og values from -128 to 127
        boolean f6; --> accepts true or false values
        short g7; --> accepts a range og values from -32768 to 32767
        long h8; --> accepts a range of values from -2^64 to 2^64-1

        //Syntax followed to initialize the data
        a1 = 490;
        b2 = 'a';
        c3 = 532.2442;
        d4 = 5.324f;
        e5 = -40;
        f6 = true;
        g7 = -5003;
        h8 = 540789327498L;
         */
        int a1; //-->// accepts a range of values from -2^31 to 2^31-1
        char b2; //--> //accepts a single value like 'A','s','4','%'
        double c3; //--> //accepts upto 16 significant digits
        float d4; //-->accepts upto 5 significant digits (after the decimal point it will accept upto 5 digits
        byte e5; //--> accepts a range og values from -128 to 127
        boolean f6;// --> accepts true or false values
        short g7; //--> accepts a range og values from -32768 to 32767
        long h8; //--> accepts a range of values from -2^64 to 2^64-1


        a1 = -490;
        b2 = 'a';
        c3 = 532.2442;
        d4 = 5.324f; //F is used at the end to indicate the compiler that it is float value
        e5 = -40;
        f6 = true;
        g7 = -5003;
        h8 = 540789327498L; //L is used at the end to indicate the compiler that it is long value

        System.out.println(a1);
        System.out.println(b2);
        System.out.println(c3);
        System.out.println(d4);
        System.out.println(e5);
        System.out.println(f6);
        System.out.println(g7);
        System.out.println(h8);


        System.out.println(a1+c3-d4);

        /*If we don't know the variable type we can initialize using var
        JAVA is statically typed programming language meaning we need to have a data type for the variable at all times
        If we do not have the exact data type, then we can use var*/

        var i9=90;
        System.out.println(i9);

        var k1=400;
        var k2=3.98;
        var k3=k1+k2;
        System.out.println(k3);

    }
}
