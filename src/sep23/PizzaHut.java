package sep23;

public class PizzaHut extends Pizzas{
    @Override
    void makeDough() {
        System.out.println("Making Bread which is hand tossed");
    }

    @Override
    void makeSauce()
    {
        System.out.println("Making Sauce which is spicy");
    }

    @Override
    void makeToppings()
    {
        System.out.println("Making Toppings like oregano");
    }

    @Override
    void addVeggies() {
        System.out.println("Adding Vegetables as per the requirement");
    }

    @Override
    void makeSnackItems() {
        System.out.println("Making snacks which is not part of PizzaHut");
    }

    @Override
    void makeDonuts() {
        System.out.println("Making Donuts which is not part of PizzaHut");
    }

    @Override
    void makePizzas() {
        System.out.println("Making Pizzas which is a pedigree of PizzaHut");
    }

    @Override
    void makeBurgers() {
        System.out.println("Making Burgers which is not part of PizzaHut");
    }
}
