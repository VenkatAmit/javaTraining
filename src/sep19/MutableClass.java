package sep19;
/*
Mutable Class --> Create the data and update the data to the same object
 */
class Cricket{
    private String teamName;

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setPayroll(double payroll) {
        this.payroll = payroll;
    }

    private double payroll;
    public Cricket(String teamName, double payroll)
    {
        this.teamName = teamName;
        this.payroll = payroll;
    }
    public String toString(){
        return  teamName +" - "+payroll;
    }
}
public class MutableClass {
    public static void main(String[] args) {
        Cricket c1 = new Cricket("India",70000000);
        System.out.println(c1);
    }

}
