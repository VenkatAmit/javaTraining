package sep23;

public class Ferrari extends CarsClasses
{

    public Ferrari(String carName) {
        super(carName);
    }

    @Override
    public void startEngine() {
        System.out.println("Staring a Ferrari");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stopping a Ferrari");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Applying Brakes on Ferrari");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating a Ferrari");

    }

    @Override
    void checkSpeed(double speed) {
        if(speed>180)
            System.out.println("You are driving the car too fast");
        else
            System.out.println("You're in acceptable speed limits");
    }
}
