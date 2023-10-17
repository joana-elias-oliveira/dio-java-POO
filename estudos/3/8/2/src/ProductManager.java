import java.util.ArrayList;
import java.util.List;

class ProductManager {
    private List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product findMostExpensiveProduct() {
        Product mostExpensive = null;
        double maxPrice = 0;

        for (Product product : products) {
            if (product.getUnitPrice() > maxPrice) {
                maxPrice = product.getUnitPrice();
                mostExpensive = product;
            }
        }

        return mostExpensive;
    }

    public int getTotalQuantity() {
        int totalQuantity = 0;

        for (Product product : products) {
            totalQuantity += product.getTotalValue();
        }

        return totalQuantity;
    }

    public double getTotalValue() {
        double totalValue = 0;

        for (Product product : products) {
            totalValue += product.getTotalValue();
        }

        return totalValue;
    }
}