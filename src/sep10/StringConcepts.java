package sep10;

public class StringConcepts {
    public static void main(String[] args){
        /*

        String is nothing but a combination of characters
        Declare a string:
            String stringvariablename=value;

        Whenever we are decalring the variable nae for the string, please follow the rules used to declare the variable
        Whenever we declare a string we enclose it in double inverted comma
        Whatever operations we perform on the string is not stored in the variable
        If we declare a variable for second time then the previous value will be overwritten

         */
        String s1="Sample Data";
        System.out.println(s1);
        System.out.println(s1.length());//length of the string
        System.out.println(s1.toLowerCase());//prints the sting in small letters
        System.out.println(s1.toUpperCase());//Prints the string in capital letters
        System.out.println(s1.concat(" Yes it is"));//joins the 2 string values
        System.out.println(s1.startsWith("Sample"));//Returns true if the condition is satisfied
        System.out.println(s1.toUpperCase().startsWith(s1));//returns false as JAVA is case-sensitive language
        String s3 = s1.toUpperCase();//assigning a variable toUpperCase
        System.out.println(s3.toUpperCase().startsWith(s3));// returns true because all are capital case letters

        System.out.println((s1.contains("Data")));//returns true if the value exists

        String s2="Welcome to one and all!, and Welcome to the esteemed panel members\n";

        System.out.println(s2.contains("one and all!"));
        System.out.println(s2.repeat(5));//repeats the sentence 5 times
        System.out.println(s2.charAt(6));//prints the character at the index value[]
        System.out.println(s2.charAt(9));
        System.out.println(s2.charAt(20));
        //System.out.println(s2.charAt(400)); --> Returns error:Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 400 out of bounds for length 24

        System.out.println(s2.replace("Welcome", "Bonjour!"));//replaces the old value with the new value
        System.out.println(s2.replaceFirst("Welcome","Bonjour!"));//replaces only the first value
        System.out.println(s2.substring(6));//prints the string from the said index position\
        System.out.println(s2.substring(25));
        //System.out.println(s2.substring(400));--> Out of bound index position
        System.out.println(s2.substring(4,25));//Here we are defining the starting index po and ending index pos
        System.out.println(s2.substring(0,30));//Starting index pos should be less than ending index pos
        System.out.println(s2.codePointAt(8));//Prints the ascii values at the 8th index pos
        System.out.println(s2.codePointCount(4,25));//Prints the number of Unicode code points in the String from beginIndex (inclusive) to endIndex (exclusive)
        System.out.println(s2.indexOf("W"));//Prints the index pos of the fist occurence of the value
        System.out.println(s2.indexOf("W",10));//prints the index pos of the value after the given index pos
        System.out.println(s2.indexOf("W",4,30));//prints the index pos of the value between the defined bounds
        System.out.println(s2.lastIndexOf("Welcome"));//Prints the index pos of the last occurence of the value
        System.out.println(s2.startsWith("Welcome",29));//Prints true or false if the string value is starting at the given index pos

        String s4="    Lion is the king of the jungle    ";
        System.out.println(s4);
        System.out.println(s4.trim());//Removes the white space at the start and the end of the string
        System.out.println(s4.strip());//similar to ".trim", and also removes unicode Characters
        System.out.println(s4.stripLeading());//Removes the white spaces at the start of the string
        System.out.println(s4.stripTrailing());//Removes the white spaces at the end of the string

        System.out.println(s4.isEmpty());
        String s5="   ";
        System.out.println(s5.isEmpty());//checks if the given string does not have any character(white spaces are considered to be character)
        System.out.println(s5.isBlank());//Checks if the given string contains only white spaces

        System.out.println(s5.equals(s4));//Checks if both the strings are equal or not including case sensitivity
        System.out.println(s5.equalsIgnoreCase(s4));//Checks if both the strings are equal or not ignoring case sensitivity
        System.out.println(s5.compareTo(s4));//Compares the string character-by-character by their ASCII Values,
        /*
        If both the strings are equal then it returns 0
        Else it returns a +ve value if the first string is greater than the second string (ASCII values)
        Else it returns a -ve value if the first string is lesser than the second string (ASCII values)
         */
        System.out.println(s1.compareToIgnoreCase(s2));//Case-sensitivity gets ignored here

        /*MultiLine strings
        We have to use 3 double inverted commas (""") to insert a paragraph with out using "\n"
         */
        String s6="He lifted the bottle to his lips and took a sip of the drink. He had tasted this before, but he couldn't quite remember the time and place it had happened. He desperately searched his mind trying to locate and remember where he had tasted this when the bicycle ran over his foot.\n" +
                "Her hair was a tangled mess which she tried to make presentable by putting in a lump on the top of her head. It didn't really work although it was a valiant attempt. While most people simply noticed the tangled mess on top of her head, what most people failed to understand that within the tangles mess was an entirely new year. That was her secret. She kept worlds on top of her head.\n" +
                "It was hidden under the log beside the stream. It had been there for as long as Jerry had been alive. He wasn't sure if anyone besides him and his friends knew of its existence. He knew that anyone could potentially find it, but it was well enough hidden that it seemed unlikely to happen. The fact that it had been there for more than 30 years attested to this. So it was quite a surprise when he found the item was missing.\n" +
                "The thing that's great about this job is the time sourcing the items involves no traveling. I just look online to buy it. It's really as simple as that. While everyone else is searching for what they can sell, I sit in front of my computer and buy better stuff for less money and spend a fraction of the time doing it.\n" +
                "He dropped the ball. While most people would think that this was a metaphor of some type, in Joe's case it was absolutely literal. He had hopes of reaching the Major League and that dream was now it great jeopardy. All because he had dropped the ball.\n";
        System.out.println(s6);
        String s7= """
                He lifted the bottle to his lips and took a sip of the drink. He had tasted this before, but he couldn't quite remember the time and place it had happened. He desperately searched his mind trying to locate and remember where he had tasted this when the bicycle ran over his foot.
                Her hair was a tangled mess which she tried to make presentable by putting in a lump on the top of her head. It didn't really work although it was a valiant attempt. While most people simply noticed the tangled mess on top of her head, what most people failed to understand that within the tangles mess was an entirely new year. That was her secret. She kept worlds on top of her head.
                It was hidden under the log beside the stream. It had been there for as long as Jerry had been alive. He wasn't sure if anyone besides him and his friends knew of its existence. He knew that anyone could potentially find it, but it was well enough hidden that it seemed unlikely to happen. The fact that it had been there for more than 30 years attested to this. So it was quite a surprise when he found the item was missing.
                The thing that's great about this job is the time sourcing the items involves no traveling. I just look online to buy it. It's really as simple as that. While everyone else is searching for what they can sell, I sit in front of my computer and buy better stuff for less money and spend a fraction of the time doing it.
                He dropped the ball. While most people would think that this was a metaphor of some type, in Joe's case it was absolutely literal. He had hopes of reaching the Major League and that dream was now it great jeopardy. All because he had dropped the ball.""";
        System.out.println(s7);
    }
}
