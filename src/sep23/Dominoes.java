package sep23;

public class Dominoes extends Pizzas{

    @Override
    void makeDough() {
        System.out.println("Making Bread which is pan tossed");
    }

    @Override
    void makeSauce()
    {
        System.out.println("Making Sauce which is juicy");
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
        System.out.println("Making snacks which is not part of Dominoes");
    }

    @Override
    void makeDonuts() {
        System.out.println("Making Donuts which is not part of Dominoes");
    }

    @Override
    void makePizzas() {
        System.out.println("Making Pizzas which is a pedigree of Dominoes");
    }

    @Override
    void makeBurgers() {
        System.out.println("Making Burgers which is not part of Dominoes");
    }
}
