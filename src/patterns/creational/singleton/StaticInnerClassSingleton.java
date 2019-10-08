package patterns.creational.singleton;

/**
 * @author：lanmengxi@viomi.com.cn
 * @createtime ：
 * @description 静态内部类实现
 * @since version 初始于版本
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
    }

    private static class SingleHolder{
        private static final StaticInnerClassSingleton SINGLETON = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return SingleHolder.SINGLETON;
    }
}
