package patterns.creational.simpleFactory;

/**
 * @author：lanmengxi@viomi.com.cn
 * @createtime ：
 * @description ：简单工厂模式，对象统一在工厂中创建，根据不同不是生产不同的对象
 * @since version 初始于版本
 */
public class Client {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("circle");
        circle.draw();

        Shape square = factory.getShape("square");
        square.draw();
    }

}
