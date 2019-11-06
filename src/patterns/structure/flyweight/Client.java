package patterns.structure.flyweight;

/**
 * 享元模式(共享对象模式):运用共享技术有效地支持大量细粒度的对象
 */
public class Client {

    public static void main(String[] args) {

        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweght flyweght1 =flyweightFactory.getFlyweight("aa");
        Flyweght flyweght2 = flyweightFactory.getFlyweight("aa");

        flyweght1.doOperation("x");
        flyweght2.doOperation("y");
    }

}
