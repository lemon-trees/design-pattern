package patterns.behavioral.templateMethod;

/**
 * 抽象类，定义算法框架，并将一些步骤的实现延迟到子类
 */
public abstract class CaffeineBeverage
{
    /**
     * 模板方法，定义算法模板步骤，final子类不可重写
     */
    final void prepareRecipe()
    {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    
    abstract void brew();
    
    abstract void addCondiments();
    
    void boilWater()
    {
        System.out.println("boilWater!");
    }
    
    void pourInCup()
    {
        System.out.println("pourInCup");
    }
    
}
