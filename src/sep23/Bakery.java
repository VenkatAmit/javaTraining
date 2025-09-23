package sep23;

public abstract class Bakery
{
    public void displayBakeryName(String bakeryName)
    {
        System.out.println("The bakery name is "+bakeryName);
    }
    abstract void makeSnackItems();

    abstract void makeDonuts();

    abstract void makePizzas();

    abstract void makeBurgers();
}
