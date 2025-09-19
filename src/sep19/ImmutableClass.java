package sep19;
/*
Immutable --> Create the data, but we can't update the data to the same object
 */
class NBA{
    private final String teamName;
    private final double payroll;

    public NBA(String teamName,double payroll){
        this.teamName = teamName;
        this.payroll = payroll;
    }

    public String toString(){
        return  teamName +" - "+payroll;
    }
}
public class ImmutableClass {
    public static void main(String[] args) {

        NBA n1 = new NBA("LA Lakers",2000000);
        System.out.println(n1);

        NBA n2 = new NBA("Golden State Warriors",3000000);
        System.out.println(n2);

    }
}
