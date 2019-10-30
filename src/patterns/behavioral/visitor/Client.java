package patterns.behavioral.visitor;

/**
 * 访问者模式,访问者模式最大的优点就是增加访问者非常容易， 我们从代码中可以看到，如果要增加一个访问者，只要新实现一个 Visitor接口的类，
 * 从而达到数据对象与数据操作相分离的效果。如果不实用访问者模式， 而又不想对不同的元素进行不同的操作， 那么必定需要使用 if-else 和类型转换，这使得代码难以升级维护。
 */
public class Client
{
    public static void main(String[] args)
    {
        BusinessReport businessReport = new BusinessReport();
        System.out.println("==========ceo查看报表============");
        businessReport.showReport(new CeoVisitor());
        
        System.out.println("==========cto查看报表============");
        businessReport.showReport(new CtoVisitor());
    }
}
