package sep23;

public class CarShowRoom {
    public static void main(String[] args) {

        CarsClasses c1 = new Honda("Pilot");
        c1.startEngine();
        c1.stopEngine();
        c1.applyBrakes();
        c1.accelerate();
        c1.checkSpeed(80);

        System.out.println("-----------------------");

        c1 = new Ferrari("812 Superfast");
        c1.startEngine();
        c1.stopEngine();
        c1.applyBrakes();
        c1.accelerate();
        c1.checkSpeed(230);

        System.out.println("-----------------------");

        //Someone has created the object somewhere during the runtime, and we do not know which child class has been used
        //We know what are the different child classes that are used in the project
        //instance of --> JDK 16 onwards, which helps us understand that whether this particular object belongs to a particular subclass or not

        if(c1 instanceof Ferrari){
            System.out.println("The object is of Ferrari");
        }


    }
}
