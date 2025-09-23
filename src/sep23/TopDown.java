package sep23;

public class TopDown {
    public static void main(String[] args) {
        TrafficSignals t1 = new IndianTrafficSignals("India");
        t1.redSignal();
        t1.greenSignal();
        t1.yellowSignal();

        System.out.println("--------------------------------------");

        t1 = new AustralianTrafficSignals("Australia");
        t1.yellowSignal();
        t1.redSignal();
        t1.greenSignal();
    }
}
