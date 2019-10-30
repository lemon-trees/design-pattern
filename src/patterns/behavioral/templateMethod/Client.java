package patterns.behavioral.templateMethod;

/**
 * 模板方法模式
 */
public class Client
{
    public static void main(String[] args)
    {
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
        
        System.out.println("-----------");
        
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
