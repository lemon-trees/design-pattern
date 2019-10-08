package patterns.creational.singleton;

/**
 * @author：lanmengxi@viomi.com.cn
 * @createtime ：
 * @description 懒汉模式：优点用到的时候才实例化
 * @since version 初始于版本
 */
public class LazySingleton {


    private static LazySingleton singleton;

    private LazySingleton() {
    }

    public static LazySingleton getInstance(){
        //线程不安全
        if (null==singleton) {
            singleton = new LazySingleton();
        }
        return singleton;
    }
//虽然安全，但是会有性能问题，在实例化的时候，其他线程会阻塞等待
//    public static synchronized LazySingleton getInstance(){
//        //线程不安全
//        if (null==singleton) {
//            singleton = new LazySingleton();
//        }
//        return singleton;
//    }
}
