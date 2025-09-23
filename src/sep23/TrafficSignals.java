package sep23;

public class TrafficSignals {

    public TrafficSignals(String country){
        System.out.println("Traffic Signals for: "+country);
    }

    public void redSignal(){
        System.out.println("Red Signal");
    }

    public void yellowSignal(){
        System.out.println("Yellow Signal");
    }

    public void greenSignal(){
        System.out.println("Green Signal");
    }

    public final void checkTrafficMachine(){
        System.out.println("Checking the Traffic Machines");
    }

}
