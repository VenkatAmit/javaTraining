package sep12;

public class PreAndPostOperations {
    public static void main(String[] args) {
        int a=30;
        //Post increment operation:
        //Value of a will be increased by 1
        //However, the updated value will not be stored immediately
        //Updated value will be stored in the temp memory
        System.out.println(a++);

        //Prints the updated value
        System.out.println(a);

        //Pre Increment Operation
        //Value of a will be increased by 1 immediately
        //Updated value will be stored immediately
        int b=90;
        System.out.println(++b);

        //Post decrement operation:
        //Value of a will be decreased by 1
        //However, the updated value will not be stored immediately
        //Updated value will be stored in the temp memory

        System.out.println(a--);
        System.out.println(a);

        //Pre decrement Operation
        //Value of a will be decreased by 1 immediately
        //Updated value will be stored immediately
        System.out.println(--b);

        int c = 45;
        System.out.println(c++ - --c + ++c + c-- + ++c - --c);

        a = 40;

        System.out.println(a++ - a--);

        b = 50;

        System.out.println(b++ - --a + b++ - ++a + ++b - a--/a++);



    }
}
