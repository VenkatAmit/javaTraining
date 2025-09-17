package sep16;

public class VarArgs {
    public static void main(String[] args) {
        /*
        Var Args stands for variable arguments --> Method will accept 0 or more arguments
        We can pass multiple arguments of the same defined data type
        We can have only one var arg for a method and should be the last parameter to be passed in the list
        We can not have multiple var args in one method
         */
        System.out.println(sumOfNumbers(3,4,5,6,7,7,3,2));
        System.out.println(sumOfNumbers(40,90));
    }
    //During the method overloading, methods with var-args will have the least preference over other methods

    public static int sumOfNumbers(int ...numbers)
    {
        //Variable arguments will be stored in the form of an array
        int sum=0;

        for (int i=0; i<numbers.length; i++)
        {
            sum+=numbers[i];
        }
        return sum;
    }
    public static int sumOfNumbers(int a, int b)
    {
        return (a+b);
    }

    /*
    public static void display(String parameter,String ...data){
        return;
    }
    */
}
