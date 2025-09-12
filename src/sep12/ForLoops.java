package sep12;

public class ForLoops {
    public static void main(String[] args) {
        /*
        For loop
        Syntax :
        for(initial var; condition; iteration value)
        {
            Codeblock to be executed
        }

        The difference between for loop and while loop is that in for loops we put everything in single line
        Whatever variables we create in the for loop will not be reused anywhere else in the program
        {(i=i+1) --> i++}
         */

        for (int i = 0; i < 30; i = i + 1)
        {
            System.out.println(i);
        }

        System.out.println("-----------------------");

        //Reverse a string
        String s="King of Pop";

        for (int i = s.length()-1; i>=0; i=i-1)
        {
            System.out.print(s.charAt(i));
        }

        System.out.println("\n-----------------------");

        String s1="Understanding the loops concepts";

        int k=50-300*10; //-2950

        System.out.println(s1.length());

        for (int i = 0; i < s1.length() ; i++) {

            if ((i%2)==0)
                System.out.println(s1.charAt(i)); //Only characters with even index positions get printed

            while (k%4==0) //-2950 is not divisible by 4, hence the while loop will not be performed
            {
                System.out.println(s1.charAt(i)+k+s1.substring(k%3,i+3));
            }
        }

        System.out.println("-----------------------");

        for (int j=2; j<1000; j=j+20)
        {
            System.out.println(j);
            j=j*10;
        }

        System.out.println("-----------------------");
/*
        for (int i=0;i<10;i++)
        {
            for (int j=0;j<10;j++)
            {
                if((i*j)%2==0)
                {
                    //if i=1 and j=0 -->
                    // Throws string index out of bounds exception as the starting index pos is greater than the ending index pos
                    while (s1.length()>0)
                    {
                        System.out.println(s1.substring(i,j));
                        break;
                    }
                }
            }
        }
*/
        System.out.println("-----------------------");

        for (int i = 0; i < s1.length(); i++) {
            for (int j = i + 1; j <= s1.length(); j++) { // j starts at i+1 so j>i
                if ((i * j) % 2 == 0) {
                    System.out.println(s1.substring(i, j));
                }
            }
        }

        System.out.println("-----------------------");

    }
}
