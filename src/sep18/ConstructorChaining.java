package sep18;

//Inside any constructor this() or super() should be the first line of code
//This was the case till JDK 21
//Since JDK 22 onwards, we have the concept of flexible constructors. which ensures that the this() and super() can be used anywhere in the constructors
//Inside a constructor, if we do not use this() or super() explicitly then,
//First line of code inside a constructor will be super()
//Because every class in JAVA is inherited from Object class --> by default uses extends object
//Extends is used to indicate that we are inheriting the data members and the methods from the parent class
class Players{
    private String pName;
    private String pCountry;
    private int points;

    public Players(){
        pName = "Sachin";
        pCountry = "India";
        points = 100;
    }

    public Players(String pName){
        this.pName = pName;
    }

    public Players(String pName,String pCountry){
        //this.pName = pName;
        this(pName); //Referring to another constructor which is having the same parameter.
        // this() should always be the first line while we are passing the parameters

        this.pCountry = pCountry;
    }

    public Players(String pName,String pCountry,int points){
        //this.pName = pName;
        //this.pCountry = pCountry;
        this(pName,pCountry);//Referring to another constructors, and we can reduce the number of lines in a code.
        this.points = points;
    }

    public void displayplayer(){
        System.out.println(pName+" plays for "+pCountry+" and has earned "+points+" points");
    }


}
public class ConstructorChaining {
    public static void main(String[] args) {

        Players o1 = new Players("Messi","Argentina",7);
        Players o2 = new Players("Ronaldo","Portugal",5);
        Players o3 = new Players("Virat","India",9);

        o1.displayplayer();
        o2.displayplayer();
        o3.displayplayer();
    }
}
