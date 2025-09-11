package sep11;

public class WhileLoops {
    public static void main(String[] args){
        /*
        Loop --> Keeps on running until the condition is satisfied

        There are 4 types of loops in JAVA:
        1. While
        2. do while
        3. for
        4. for each
         */
        var a=40;
        while (a==40){
            System.out.println(a);
            break; // terminate the loop immediately
        }

        System.out.println("-----------------------");

        while (a<=50){
            System.out.println(a);
            a=a+1; //increasing the value by 1
        }

        System.out.println("-----------------------");

        while (a<=100){
            System.out.println(a);
            a=a+5;
        }

        System.out.println("-----------------------");

        String str = "Sample Data for understanding";
        while (str.length()>0){
            System.out.println(str.substring(0,str.length()-1));
            str=str.substring(0,str.length()-1);
        }

        System.out.println("-----------------------");

        while (str.length()==0){
            str="Understanding loops \n";
            System.out.println(str.repeat(3));
        }

    }
}
