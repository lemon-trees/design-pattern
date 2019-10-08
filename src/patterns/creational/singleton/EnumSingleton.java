package patterns.creational.singleton;

/**
 * @author：lanmengxi@viomi.com.cn
 * @createtime ：
 * @description 枚举实现单例,这种方法实现不熟反射影响
 * @since version 初始于版本
 */
public enum  EnumSingleton {

    INSTANCE;

    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
