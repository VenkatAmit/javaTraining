package sep19;

public class Car {

    int a = 10;

    public void startEngine(){
        System.out.println("Starting a new engine");
    }

    public void stopEngine(){
        System.out.println("Stopping a new engine");
    }

    public void accelerate(){
        System.out.println("Accelerating a new car");
    }

    void applyBrakes()
    {
        System.out.println("Applying Brakes");
    }

    private void checkSpeed(){
        System.out.println("Checking Speed");
    }

    protected void changeGears(){
        System.out.println("Changing Gears");
    }

    static void paintCars(){
        System.out.println("Paint Cars in black");
    }
}


