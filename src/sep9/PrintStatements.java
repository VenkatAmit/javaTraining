package sep9;

public class PrintStatements {
    public static void main(String[]args){

        //Shortcut for typing System.out.println
        //In Intellij: type sout followed by enter key
        //In Eclipse: type sysout followed by ctrl+space
        //In VS Code: type sout followed by enter key
        System.out.println("Hello World");
        System.out.println("Today is the first day of learning java");
        System.out.println("Understanding the Print Statements");

        //In JAVA we follow BODMAS rule for performing arithmetic operations
        System.out.println(40-50*100+10);
        System.out.println(30-400*10/2-300/4);
        System.out.print(false);

        // "\t" represents tab
        System.out.println("\t"+true);

        // sum of ascii values
        //A-Z = 65-90
        //a-z = 97-122
        //0-9 = 48-57
        // white space = 32
        System.out.println('g'+'t');

        //"\r" removes the data before it
        System.out.println("King is making some\r promises");

        //"\b" represents backspace
        System.out.println("Lion i\bs the king of the jungle");

        // \" helps us in putting the data surrounded with inverted commas
        System.out.println("\"A\" is alive");

        //Shortcut for typing System.err.println
        //In Intellij: type serr followed by enter key
        //In Eclipse: type syserr followed by ctrl+space
        //In VS Code: type serr followed by enter key
        //Displays the errors - red color
        System.err.println("printing the errors");
        System.out.println("Hello World");
    }
}
