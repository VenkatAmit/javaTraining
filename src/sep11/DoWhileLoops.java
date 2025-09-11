package sep11;

public class DoWhileLoops {
    public static void main(String[] args) {

        /*
        Do while loop:
        Loop runs at-least once irrespective of the condition being satisfied or not

        #Syntax:
        do{
            block of code
          }
        while(condition);  */
        int a=100;

        do {
            System.out.println(a);
        }
        while (a==200);

        System.out.println("-----------------------");

        a=400;

        do {
            System.out.println(a);
            break;
        }
        while (a==40);

        System.out.println("-----------------------");

        a=500;

        do{
            System.out.println(a);
            a=a+5;
        }
        while (a<600);

        System.out.println("-----------------------");

        do {
            a=a+10;
            if(a==700)
                continue;

            System.out.println(a);
        }
        while (a<1000);

        System.out.println("-----------------------");

        a=a-50-40*10/4-300%2+400;
        String t="All is well\n";
// Self assignment operation --> Previous value of any variable can be participated in any arithmetic operations and returns the updated value to the same variable again
        do{
            t.replace("well","Well");
            System.out.println(t);
            while (a>0){
                System.out.println(a*a);
                a=a/2;
            }
            t="a";
        }
        while (t.length()%2==0);
    }
}
