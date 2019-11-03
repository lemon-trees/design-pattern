package patterns.structure.bridge;

/**
 * 桥接模式
 */
public class Client {

    public static void main(String[] args) {
        White white = new White();

        Shape square = new Square();
        square.setColor(white);
        square.draw();

        Shape rectangle = new Rectangle();
        rectangle.setColor(white);
        rectangle.draw();
    }

}
