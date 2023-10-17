import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductController productController = ProductController.getInstance();

        // Adicionar produtos
        productController.addProduct(new Product(1, "Produto A", 10));
        productController.addProduct(new Product(2, "Produto B", 5));
        productController.addProduct(new Product(3, "Produto A", 7));

        // Atualizar a quantidade de um produto
        productController.updateProduct(1, 15);

        // Remover um produto
        productController.removeProduct(2);

        // Encontrar um produto por código
        Product foundProduct = productController.findProductByCode(3);
        if (foundProduct != null) {
            System.out.println("Produto encontrado: " + foundProduct);
        } else {
            System.out.println("Produto não encontrado.");
        }

        // Encontrar produtos por nome
        List<Product> matchingProducts = productController.findProductsByName("Produto A");
        System.out.println("Produtos com nome 'Produto A':");
        for (Product product : matchingProducts) {
            System.out.println(product);
        }

        // Listar todos os produtos
        List<Product> allProducts = productController.getAllProducts();
        System.out.println("Todos os produtos:");
        for (Product product : allProducts) {
            System.out.println(product);
        }
    }
}
