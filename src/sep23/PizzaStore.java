package sep23;

public class PizzaStore {
    public static void main(String[] args) {
        Pizzas p1 = new Dominoes();
        p1.makePizzas();

        Pizzas p2 = new PizzaHut();
        p2.makePizzas();
    }
}
