package sep23;

//Without creating an object of the main class, we can not create an instance of the sub-class
public class InnerClass {

    private String employmentType;
    private double salary;

    public InnerClass(String employmentType, double salary){
        this.employmentType=employmentType;
        this.salary=salary;
    }

    class SubInnerClass{
        private String name;
        private int age;

        public SubInnerClass(String name, int age){
            this.name=name;
            this.age=age;
        }
    }

    public static void main(String[] args) {

        InnerClass innerClasses = new InnerClass("Full Time",90000.00); //Creating an object of Inner Class

        //If we want to create an object of inner Class, we need to first create the object of the outer class
        //Then we can crearte the object of inner class
        SubInnerClass subInnerClass = innerClasses.new SubInnerClass("DOG",90);

    }
}
