package sep15;

public class AccessModifiers {
    private void display(){
        System.out.println("Display method called");

    }
    static double squareOfANumber(double val){
        return val*val;
    }
    public static double cubeOfANumber(double val){
        return val*val*val;
    }

    protected static int cubeOfANumber(int val){
        return val*val*val;
    }
}
