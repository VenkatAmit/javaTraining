package sep17;

class Names{
    /*
    Variables declared at class level are called as instance variables
     */
    private String fName;
    private String lName;
    private String mName;

    /*
    Variables declared at method level are called as local variables
     */
//    public Names(String firstName,String lastName, String middleName){
//        fName = firstName;
//        lName = lastName;
//        mName = middleName;
//    }

    //the java language is confused as to which variable to refer as both have same names --> without the use of this keyword
    //'this' keyword is used to differentiate between the instance and the local variable
    //this keyword is used at variable level, method level and at a constructor level
    public Names(String fName,String lName, String mName){
        this.fName = fName;
        this.lName = lName;
       this.mName = mName;
    }

    public void display()
    {
        System.out.println(fName+" -- First Name");
        System.out.println(lName+" -- Last Name");
        System.out.println(mName+" -- Middle Name");

    }
        }
public class ThisKeyword {
    public static void main(String[] args) {
        Names n1 = new Names("Amit","Kommineni","Venkat");
        n1.display();
    }
}
