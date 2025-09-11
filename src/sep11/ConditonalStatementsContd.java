package sep11;

public class ConditonalStatementsContd {
    public static void main(String[] args) {
        var a = 40;
        var b = 75;

        if((a*b%5)%11==0)
            System.out.println("Remainder of the operation is 0");
        else
            System.out.println("Remainder of the operation is greater than 0");

        //Nested Conditions

        String s="Sample Data for understanding ";
        System.out.println(s.length());

        if(s.length()>0)
        {
            if((a+b)==115)
            {
                System.out.println(s.substring(0,(a+b)/(a+b)));
                s=s.substring(0,(a+b)/(a+b));
            }
            else
                System.out.println("None of the above conditions are matching");
        }

        if(s.length()%2==0)
        {
            if(a%2!=0 || !(b%11==0))
            {
                if(s.charAt(3)%3!=0)
                {
                    System.out.println(s.substring(s.length()/4,s.length()/2));

                }
                else
                {
                    System.out.println(s.substring(s.substring(0, 5).length(),
                            s.substring(s.length() / 2).length()));
                }
            }
        }
        else{
            System.out.println("Not allowed to perform");
        }

        //Else if is used when there is more than one condition to validate

        if (a%9==0)
            System.out.println(a+" is divisible by 9");
        else if (a%3==0) {
            System.out.println(a+" is divisible by 3");
        }
        else if (a%7==0) {
            System.out.println(a+" is divisible by 7");
        } else if (a%4==0) {
            System.out.println(a+" is divisible by 4");
        }
        else {
            System.out.println(a);
        }

        String s1="Understanding conditional statements";

        if (s1.substring(0,10).length()==9){
            if(s1.substring((a/10+a/20),(a/2+a/4)).isBlank()){
                System.out.println(s1.substring((a/10+a/20),(a/2+a/4)));
            }
            else if(s1.indexOf("z")==-1) {
                System.out.println(s1.substring((a/10+a/20),(a/2+a/20)));
            }
        }
        else
            System.out.println("Not able to perform");
    }
}
