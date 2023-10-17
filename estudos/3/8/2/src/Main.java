public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();

        // Adicionar produtos ao estoque
        productManager.addProduct(new Product(1, "Produto A", 10, 15.99));
        productManager.addProduct(new Product(2, "Produto B", 5, 20.49));
        productManager.addProduct(new Product(3, "Produto C", 7, 12.99));

        // Encontrar o produto mais caro
        Product mostExpensiveProduct = productManager.findMostExpensiveProduct();
        System.out.println("Produto mais caro: " + mostExpensiveProduct.getName());

        // Obter a quantidade total de produtos
        int totalQuantity = productManager.getTotalQuantity();
        System.out.println("Quantidade total de produtos: " + totalQuantity);

        // Obter o valor total do estoque
        double totalValue = productManager.getTotalValue();
        System.out.println("Valor total do estoque: R$" + totalValue);
    }
}