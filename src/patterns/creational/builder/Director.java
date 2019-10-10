package patterns.creational.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Director build(){
        builder.buildPartA();
        builder.buildPartB();
        return this;
    }

    public Product getProduct(){
        return builder.getProduct();
    }

}
