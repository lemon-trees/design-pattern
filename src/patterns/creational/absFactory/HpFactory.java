package patterns.creational.absFactory;

/**
 * @author：lanmengxi@viomi.com.cn
 * @createtime ：
 * @description
 * @since version 初始于版本
 */
public class HpFactory implements AbstractFactory {

    @Override
    public Mouse createMouse() {
        return new HpMouse();
    }

    @Override
    public Keyboard createKeyboard() {
        return new HpKeyboard();
    }
}
