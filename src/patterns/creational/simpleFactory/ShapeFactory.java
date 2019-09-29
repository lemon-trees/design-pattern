package patterns.creational.simpleFactory;

/**
 * @author：lanmengxi@viomi.com.cn
 * @createtime ：
 * @description
 * @since version 初始于版本
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){

        switch (shapeType){

            case "circle":
                return new Circle();
            case "square":
                return new Square();
            case "rectangle":
                return new Rectangle();
            default:
                return null;
        }

    }

}
