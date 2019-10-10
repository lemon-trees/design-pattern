package patterns.creational.builder;

public class ProductBuilder extends Builder {

    public ProductBuilder(Product product) {
        super(product);
    }

    @Override
    public void buildPartA() {
        product.setPartA("partA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("partB");
    }

    public Product getProduct() {
        return product;
    }
}
