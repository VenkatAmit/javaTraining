package sep23;

/*
If the inner class is not static, then we can not use the inner classes for inheritance

 */

public class InnerClassesWithInheritance extends InnerClass{

    public InnerClassesWithInheritance(String employmentType, double salary) {
        super(employmentType, salary);
    }

    //We can create the objects of the sub inner class directly if we inherited the main class
    public void accessInnerClass(){
        new SubInnerClass("Cat",9);
    }
}
