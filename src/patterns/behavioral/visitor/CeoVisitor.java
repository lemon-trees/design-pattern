package patterns.behavioral.visitor;

public class CeoVisitor implements Visitor
{
    @Override
    public void visit(Engineer engineer)
    {
        System.out.println("工程师：" + engineer.getName() + "kpi:" + engineer.getKpi());
    }
    
    @Override
    public void visit(Manager manager)
    {
        System.out.println("经理：" + manager.getName() + "kpi:" + manager.getKpi() + "新产品数：" + manager.getProducts());
    }
}
