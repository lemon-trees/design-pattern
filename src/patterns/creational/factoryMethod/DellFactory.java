package patterns.creational.factoryMethod;

/**
 * @author：lanmengxi@viomi.com.cn
 * @createtime ：
 * @description
 * @since version 初始于版本
 */
public class DellFactory implements Factory {

    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }
}
