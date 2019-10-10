package patterns.creational.builder;

public abstract class Builder {

    protected Product product;

    public Builder(Product product) {
        this.product = product;
    }
    abstract void buildPartA();

    abstract void buildPartB();

    public Product getProduct(){
        return product;
    }

}
