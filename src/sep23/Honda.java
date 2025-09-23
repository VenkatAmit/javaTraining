package sep23;

public class Honda extends CarsClasses{

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
}
