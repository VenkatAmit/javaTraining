package sep15;

public class SampleClass {
    public static void main(String[] args) {
        /*
        Whenever we want to call any static method from another class - syntax:
        ```ClassName.MethodName();```

        Since the display method is private, we can't access this outside of the class
        Hence, throws a compilation error
         */
        //AccessModifiers.display();
        System.out.println(AccessModifiers.squareOfANumber(40.2));
        System.out.println(AccessModifiers.cubeOfANumber(40.85));
        MethodDeclarations.callingPublicMethod();
    }

}
