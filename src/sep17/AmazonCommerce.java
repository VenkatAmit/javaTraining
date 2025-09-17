package sep17;

public class AmazonCommerce {
    private String name;
    private String product;
    private String paymentMethod;
    private double price;

    public AmazonCommerce()
    {
        name = "Fossil Watch";
        product = "Watch";
        paymentMethod = "COD";
        price = 4999.99;
    }

    public void displayDetails(){
        System.out.println("Watch Name: "+name);
        System.out.println("Product Category: "+product);
        System.out.println("Price: "+price);
        System.out.println("Mode of Payment: "+paymentMethod);
    }
}

