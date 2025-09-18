package sep17;

public class MethodChaining {
    public static void main(String[] args) {
        AmazonECommerce aec = new AmazonECommerce();

        AmazonECommerce aec1 = new AmazonECommerce();

        //More number of unnecessary lines of code will lead to memory leakages
        aec.login()
                .searchForProduct("Watches")
                .applyFilters()
                .addToCart()
                .makePayment("Cash")
                .generateOrderNumber()
                .searchForProduct("Pants")
                .applyFilters()
                .addToCart()
                .makePayment("Card")
                .generateOrderNumber()
                .logout();
//        aec.searchForProduct("Watches");
//        aec.applyFilters();
//        aec.addToCart();
//        aec.makePayment("Cash");
//        aec.generateOrderNumber();
//        aec.logout();

    }
}
