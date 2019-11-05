package patterns.structure.decorator;

/**
 * 装饰器模式:注意和代理模式的区别
 */
public class Client
{
    public static void main(String[] args)
    {
        Beverage beverage = new HouseBlend();
        beverage = new Mocha(beverage);
        beverage = new Milk(beverage);
        System.out.println(beverage.cost());
        
    }
}
