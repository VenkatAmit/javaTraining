package sep23;

public class Honda extends CarsClasses{

    public Honda(String carName) {
        super(carName);

    }

    @Override
    public void startEngine()
    {
        System.out.println("Starting the Honda Engine");
    }

    @Override
    public void stopEngine()
    {
        System.out.println("Stopping the Honda Engine");
    }

    @Override
    public void applyBrakes()
    {
        System.out.println("Applying the brakes on Honda");
    }

    @Override
    public void accelerate()
    {
        System.out.println("Accelerating the Honda Car");
    }

    @Override
    public void checkSpeed(double speed) {
        if(speed>120)
            System.out.println("You are driving the car too fast");
        else
            System.out.println("You're in acceptable speed limits");
    }
}
