package patterns.creational.factory;

/**
 * @author：lanmengxi@viomi.com.cn
 * @createtime ：
 * @description
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
