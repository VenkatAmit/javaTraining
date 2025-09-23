package sep23;

public class Ferrari extends CarsClasses
{

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
}
