package sep23;

class Players{
    private String name;
    private int age;
    public Players(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return  name+" is "+age+" years old";
    }
}
class Employees{
    String name;
    int age;
    public Employees(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return  name+" is "+age+" years old";
    }
}
public class TernaryOperators {

    public static void main(String[] args) {
        //Ternary Operator is short-hand form of single if else condition

        int d=30;
//        if(d==30)
//            System.out.println("Value of d is 30");
//        else
//            System.out.println("Value of d is not 30");

        //Syntax of ternary operator:
        //```condition?true:false```
        //Inside a ternary operator, we can not write any print statements, it always returns a value

        System.out.println(d==30?"Value of d is 30":"Value of d is not 30");

        d=50;
        System.out.println(d%5==0?"Value of d is divisible by 50":"Value of d is not divisible by 50");

        d=40;
        int b=50;

        //Nested Ternary operator
        String j = (d % 5 == 0 && d % 3 == 0) ? "Value of d is divisible by 5 and value of b is divisible by 3" : "Value of d is not divisible by 5 or value of b is not divisible by 3";
        System.out.println(j);

        String i = (d % 5 == 0 && d % 3 == 0) ? "Value of d is divisible by 5 and value of b is divisible by 3" :
                d%5==0?"Value of d is divisible by 5 but value of b is not divisible by 3":
                        "Value of b is divisible by 3 but value of d is not divisible by 5";
        System.out.println(i);

        //Object is the parent class of all classes

        Object o1 = new Players("Sai",27);
        Object o2 = new Employees("Amul",50);
        System.out.println(o1 instanceof Players?o1: "Not an object of Players Class");

    }
}
