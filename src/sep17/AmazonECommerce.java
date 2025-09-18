package sep17;

public class AmazonECommerce {

    public AmazonECommerce login()
    {

        //this keyword will refer to the current object that we are using
        System.out.println("Logging into the application");
        return this;
    }

    public AmazonECommerce logout()
    {
        System.out.println("Logging out");
        return this;
    }

    public AmazonECommerce searchForProduct(String productName)
    {
        System.out.println("Searching for product "+productName);
        return this;
    }

    public AmazonECommerce applyFilters()
    {
        System.out.println("Applying filters as per requirement");
        return this;
    }

    public AmazonECommerce addToCart()
    {
        System.out.println("adding products to the cart");
        return this;
    }

    public AmazonECommerce makePayment(String paymentMethod)
    {
        System.out.println("Payment Method "+paymentMethod);
        return this;
    }

    public AmazonECommerce generateOrderNumber()
    {
        System.out.println("Generating order number and it is: 873e9030990");
        return this;
    }
}
