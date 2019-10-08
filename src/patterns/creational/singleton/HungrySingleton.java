package patterns.creational.singleton;

/**
 * @author：lanmengxi@viomi.com.cn
 * @createtime ：
 * @description 饿汉模式，线程安全
 * @since version 初始于版本
 */
public class HungrySingleton {

    private static HungrySingleton singleton;

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance(){
        return singleton;
    }
}
