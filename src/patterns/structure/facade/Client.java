package patterns.structure.facade;

/**
 * 外观模式:使用统一的接口来访问多个子系统，使系统更加容易访问。遵从最少知道原则。
 */
public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.watchMovie();
    }

}
