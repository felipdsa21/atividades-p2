package activity1;

import java.util.ArrayList;

public class ShoppingCart {
    private int customerID;
    private ArrayList<Product> productList = new ArrayList<>();

    public ShoppingCart(int customerID) {
        this.customerID = customerID;
    }

    public void addProduct(Product product) {
        this.productList.add(product);
    }

    public void removeProduct(Product product) {
        this.productList.remove(product);
    }

    public String getContents() {
        var contents = new StringBuilder();

        for (var product : this.productList) {
            var formattedPrice = String.format("%.2f", product.getPrice());
            contents.append("* ").append(product.getName()).append(' ');
            contents.append("- R$ ").append(formattedPrice).append('\n');
        }

        return contents.toString();
    }

    public int getCustomerID() {
        return this.customerID;
    }

    public int getItemCount() {
        return this.productList.size();
    }

    public double getTotalPrice() {
        var totalPrice = 0.0;

        for (var product : this.productList) {
            totalPrice += product.getPrice();
        }

        return totalPrice;
    }
}
