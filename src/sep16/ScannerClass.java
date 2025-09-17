package sep16;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        //Scanner class is used to read the data from the console
        //System.in --> Read the data from the console

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the first numbers");
        int a=sc.nextInt(); //nextInt means it expecting an integer, if we pass any other value than integer, it will throw input intact exception

        System.out.println("Enter the second numbers");
        int b=sc.nextInt();

        System.out.println("Sum of the values is: "+(a+b));

        System.out.println("Enter the first decimal value");
        double c=sc.nextDouble();

        System.out.println("Enter the second decimal values");
        double d=sc.nextDouble();

        System.out.println("Sum of the values is: "+(c+d));

        //To read a long value: .nextLong()
        //To read a Short value: .nextShort()
        //To read a float value: .nextFloat()
        //To read a byte value: .nextByte()

        System.out.println("Reading a character");
        char c1=sc.next().charAt(0);

        System.out.println(c1);

        System.out.println("Reading the String");
        String s=sc.next();

        System.out.println(s);

        System.out.println("Reading the String");

        while (sc.hasNextLine()) // Checking if there is any new line of data
        {
            System.out.println(sc.nextLine());//Print the data
            break;//Exit from the loop
        }

    }
}
