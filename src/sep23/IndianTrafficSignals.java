package sep23;

//If the parent class does not have any default constructor and only parameterized constructors are available
//Then, in the Child Class we need to inherit hte constructor

public class IndianTrafficSignals extends TrafficSignals{

    public IndianTrafficSignals(String country) {
        super(country); //Referring to the parent class parameterized constructor
    }

    public void redSignal(){
        System.out.println("Red Signal in India stays for 90 seconds");
    }

    public void yellowSignal(){
        System.out.println("Yellow Signal in India stays for 90 seconds ");
    }

    public void greenSignal(){
        System.out.println("Green Signal in India stays for 90 seconds");
    }

    //If the method is final, then we can not override the method in the Child Class else it throws compilation error
//    public void checkTrafficMachine(){
//        System.out.println("Checking traffic machine");
//    }
}
