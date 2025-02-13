package activity2;

public class Main {
    public static void main(String[] args) {
        var customerID = 1;
        var cart = new ShoppingCart(customerID);

        var product1 = new TV("LG", 1754.10, 43);
        var product2 = new TV("Samsung", 2324.07, 50);
        var product3 = new Refrigerator("Electrolux", 2255.06, 260);
        var product4 = new Refrigerator("Consul", 3063.46, 386);
        var product5 = new Stove("Brastemp", 2369.00, 6);
        var product6 = new Stove("Esmaltec", 732.26, 4);

        addProductAndPrint(cart, product1);
        addProductAndPrint(cart, product2);
        addProductAndPrint(cart, product3);
        addProductAndPrint(cart, product4);
        addProductAndPrint(cart, product5);
        addProductAndPrint(cart, product6);

        removeProductAndPrint(cart, product1);
        removeProductAndPrint(cart, product2);
        removeProductAndPrint(cart, product4);

        System.out.println("Finalizando...");
        System.out.println();

        System.out.println("Informações do carrinho:");
        System.out.println("ID do comprador: " + cart.getCustomerID());
        System.out.println("Quantidade de itens: " + cart.getItemCount());
        System.out.println("- Itens adicionados: ");
        System.out.print(cart.getContents());
        System.out.printf("Preço total: R$ %.2f\n", cart.getTotalPrice());
    }

    private static void addProductAndPrint(ShoppingCart cart, Product product) {
        cart.addProduct(product);
        System.out.println("Adicionou \"" + product.getBrand() + "\"");
        System.out.printf("Preço total do carrinho: R$ %.2f\n", cart.getTotalPrice());
        System.out.println();
    }

    private static void removeProductAndPrint(ShoppingCart cart, Product product) {
        cart.removeProduct(product);
        System.out.println("Removeu \"" + product.getBrand() + "\"");
        System.out.printf("Preço total do carrinho: R$ %.2f\n", cart.getTotalPrice());
        System.out.println();
    }
}
