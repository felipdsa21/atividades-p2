package activity1;

public class Main {
    public static void main(String[] args) {
        var customerID = 1;
        var cart = new ShoppingCart(customerID);

        var product1 = new Product("Laranja", 3.00);
        var product2 = new Product("Melancia", 5.00);
        var product3 = new Product("Pizza", 15.00);
        var product4 = new Product("Arroz", 8.00);
        var product5 = new Product("Suco", 4.00);

        addProductAndPrint(cart, product1);
        addProductAndPrint(cart, product2);
        addProductAndPrint(cart, product3);
        addProductAndPrint(cart, product4);
        addProductAndPrint(cart, product5);

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
        System.out.println("Adicionou \"" + product.getName() + "\"");
        System.out.printf("Preço total do carrinho: R$ %.2f\n", cart.getTotalPrice());
        System.out.println();
    }

    private static void removeProductAndPrint(ShoppingCart cart, Product product) {
        cart.removeProduct(product);
        System.out.println("Removeu \"" + product.getName() + "\"");
        System.out.printf("Preço total do carrinho: R$ %.2f\n", cart.getTotalPrice());
        System.out.println();
    }
}
