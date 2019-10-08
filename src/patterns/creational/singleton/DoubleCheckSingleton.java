package patterns.creational.singleton;

/**
 * @author：lanmengxi@viomi.com.cn
 * @createtime ：
 * @description 双重校验
 * @since version 初始于版本
 */
public class DoubleCheckSingleton {

    private volatile static DoubleCheckSingleton singleton;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (null==singleton) {
            synchronized (DoubleCheckSingleton.class){
                if (null==singleton) {
                    //使用volatile修饰，禁止在这里jvm指令重排序，避免在多线程环境下，返回未初始化的对象
                    singleton=new DoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
