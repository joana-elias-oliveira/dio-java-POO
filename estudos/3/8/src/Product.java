public class Product {
    private int code;
    private String name;
    private int quantity;

    // Construtor para inicializar um produto com código, nome e quantidade
    public Product(int code, String name, int quantity) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
    }

    // Métodos getters e setters para código, nome e quantidade
    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Método toString para representar o produto como uma string
    @Override
    public String toString() {
        return "Product{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}