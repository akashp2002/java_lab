public class Product {
    private String pcode;
    private String pname;
    private double price;

    public Product(String pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    public String getPcode() {
        return pcode;
    }

    public String getPname() {
        return pname;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Product product1 = new Product("P001", "Product A", 250.0);
        Product product2 = new Product("P002", "Product B", 150.0);
        Product product3 = new Product("P003", "Product C", 200.0);

        Product lowestPricedProduct = product1;

        if (product2.getPrice() < lowestPricedProduct.getPrice()) {
            lowestPricedProduct = product2;
        }

        if (product3.getPrice() < lowestPricedProduct.getPrice()) {
            lowestPricedProduct = product3;
        }

        System.out.println("Product with the lowest price:");
        System.out.println("Code: " + lowestPricedProduct.getPcode());
        System.out.println("Name: " + lowestPricedProduct.getPname());
        System.out.println("Price: " + lowestPricedProduct.getPrice());
    }
}
