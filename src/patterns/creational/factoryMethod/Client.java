package patterns.creational.factoryMethod;

/**
 * @author：lanmengxi@viomi.com.cn
 * @createtime ：
 * @description 工厂方法模式：抽象出工厂，由具体的工厂生产需要的具体的对象
 * @since version 初始于版本
 */
public class Client {

    public static void main(String[] args) {
        Factory factory = new DellFactory();
        Mouse dellMouse = factory.createMouse();
        dellMouse.click();
    }

}
