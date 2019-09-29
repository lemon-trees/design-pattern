package patterns.creational.absFactory;

/**
 * @author：lanmengxi@viomi.com.cn
 * @createtime ：
 * @description 抽象工厂模式：抽象出工厂，并针对有产品族和产品等级概念的场景，工厂抽象类里面的方法并不是随意堆砌，
 * 而是相互依赖或者相互关联的
 * @since version 初始于版本
 */
public class Client {

    public static void main(String[] args) {

        AbstractFactory factory = new DellFactory();
        factory.createKeyboard().enter();
        factory.createMouse().click();

    }


}
