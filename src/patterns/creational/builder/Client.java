package patterns.creational.builder;

/**
 * 生成器模式
 */
public class Client {

    public static void main(String[] args) {
        ProductBuilder productBuilder = new ProductBuilder(new Product());
        Product product = new Director(productBuilder).build().getProduct();
        System.out.println(product.toString());
    }

}
