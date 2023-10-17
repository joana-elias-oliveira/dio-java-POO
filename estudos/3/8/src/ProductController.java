import java.util.ArrayList;
import java.util.List;

// Classe que controla os produtos
public class ProductController {
    private static ProductController instance;
    private List<Product> products;

    // Construtor privado para garantir que apenas uma instância da classe seja criada
    private ProductController() {
        products = new ArrayList<>();
    }

    // Método estático para obter a instância única da classe
    public static ProductController getInstance() {
        if (instance == null) {
            instance = new ProductController();
        }
        return instance;
    }

    // Adicionar um produto à lista de produtos
    public void addProduct(Product product) {
        products.add(product);
    }

    // Atualizar a quantidade de um produto com base no código
    public void updateProduct(int code, int newQuantity) {
        for (Product product : products) {
            if (product.getCode() == code) {
                product.setQuantity(newQuantity);
                return;
            }
        }
    }

    // Remover um produto com base no código
    public void removeProduct(int code) {
        products.removeIf(product -> product.getCode() == code);
    }

    // Encontrar um produto com base no código
    public Product findProductByCode(int code) {
        for (Product product : products) {
            if (product.getCode() == code) {
                return product;
            }
        }
        return null; // Retorna null se o produto não for encontrado
    }

    // Encontrar produtos com base no nome
    public List<Product> findProductsByName(String name) {
        List<Product> matchingProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                matchingProducts.add(product);
            }
        }
        return matchingProducts;
    }

    // Obter todos os produtos
    public List<Product> getAllProducts() {
        return products;
    }
}