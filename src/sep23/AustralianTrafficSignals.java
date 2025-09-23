package sep23;

public class AustralianTrafficSignals extends TrafficSignals{

    public AustralianTrafficSignals(String country) {
        super(country);
    }

    public void redSignal(){
        System.out.println("Red Signal in Australia stays for 60 seconds");
    }

    public void yellowSignal(){
        System.out.println("Yellow Signal in Australia stays for 60 seconds");
    }

    public void greenSignal(){
        System.out.println("Green Signal in Australia stays for 60 seconds");
    }
}
