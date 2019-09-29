package patterns.creational.absFactory;

/**
 * @author：lanmengxi@viomi.com.cn
 * @createtime ：
 * @description
 * @since version 初始于版本
 */
public class DellFactory implements AbstractFactory {

    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new DellKeyboard();
    }
}
