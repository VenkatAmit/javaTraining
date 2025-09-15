package sep15.subpackage;

import sep15.AccessModifiers;
import sep15.MethodDeclarations;

public class MethodCalling {
    public static void main(String[] args) {
        //We can not access the methods here as the default methods can not be accessed from another package
        //System.out.println(AccessModifiers.squareOfNumbers(20.3));

        //Public Methods can be called across the packages
        System.out.println(AccessModifiers.cubeOfANumber(50.65));

        MethodDeclarations.callingPublicMethod();

    }

}
