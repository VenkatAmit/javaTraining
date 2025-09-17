package sep16;

class EmpDetails{
    private int empId;
    private String empName;
    private String deptName;
    private double salary;

    //We have to use the concept off getter/ setters to set and get the values of each and every variable
    //We use setter and getters as they help in structuring the code block
    //Encapsulation is hiding the data members from the outside world and accessing them by using Setters/ Getters method


    public void setEmpName(String name){
        empName = name;
    }

    public String getEmpName(){
        return empName;
    }

    public void setEmpId(int employeeID){
        empId = employeeID;
    }

    public int getEmpId(){
        return empId;
    }

    public void setDeptName(String name){
        deptName = name;
    }

    public String getDeptName(){
        return deptName;
    }

    public void setSalary(double empSalary){
        salary = empSalary;
    }

    public double getSalary(){
        return salary;
    }

    public void displayEmpDetails(){
        System.out.println("Emp ID: "+empId);
        System.out.println("Emp Name: "+empName);
        System.out.println("Dept Name: "+deptName);
        System.out.println("Sal: "+salary);
    }
}
public class EncapsulationConcepts {
    public static void main(String[] args) {

        //empDetails is an object that has been created
        //After creating the object we are updating it by passing values

        EmpDetails empDetails = new EmpDetails();

        empDetails.setEmpId(90);
        empDetails.setEmpName("Mr.Robot");
        empDetails.setDeptName("Cyber Security");
        empDetails.setSalary(8000);

        empDetails.displayEmpDetails();
        empDetails.getDeptName();
        empDetails.getEmpId();
        empDetails.getEmpName();
        empDetails.getSalary();

    }
}
