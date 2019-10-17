package patterns.behavioral.iterator;

/**
 * 迭代器模式:通过提供一种顺序访问聚合对象元素的方法，并且不暴露聚合对象的内部表示。
 */
public class Client
{
    
    public static void main(String[] args)
    {
        Aggregate<Integer> concreteAggregate = new ConcreteAggregate();
        Iterator iterator = concreteAggregate.createIterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        
    }
}
