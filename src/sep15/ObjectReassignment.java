package sep15;
/*
If we do not assign any value to the integer/short/byte/long,it will take 0 as default value
If we do not assign any value to the double/float,it will take 0.0 as default value
If we do not assign any value to the Char,it will take ' ' as default value
If we do not assign any value to the boolean,it will take false as default value
If we do not assign any value to the String/Non-Primitive Data Type,it will take null as default value
 */
class Numbers{
    int hDigit;
    int tDigit;
    int uDigit;
    public void display(){
        System.out.println("Number Dispayed is: "+hDigit+tDigit+uDigit);
    }
}
public class ObjectReassignment {
    public static void main(String[] args) {
        Numbers n1=new Numbers();
        n1.hDigit=4;
        n1.tDigit=5;
        n1.uDigit=6;
        n1.display();

        Numbers n2 = new Numbers();
        n2.uDigit=8;
        n2.tDigit=7;
        n2.hDigit=9;
        n2.display();

        //Returns false because the object references of n1 and n2 are different
        System.out.println(n1==n2);

        n2=n1;//Reassigning the objects

        n2.display();

        //Since n2=n1 --> Whatever changes that we make in n1 will impact n2 also
        n1.hDigit=10;
        n1.display();
        n2.display();

        //In this case both n1 and n2 are pointing to the same reference
        System.out.println(n1==n2);
        System.out.println(n1.equals(n2));

        //n2 object will lose the access of the object
        //It is like deleting the object reference
        n2=null;
        n2=n1;

        //Any actions performed on the null object throws NullPointerException
        //n2.display();
        //Heap memory cleanup is done by garbage collector after the execution


        Numbers n3 = new Numbers();
        n3.tDigit=6;
        n3.uDigit=7;
        n3.hDigit=11;

        n3.display();
        n3=n2;
        n3.display();



    }
}
