package patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * ObjectStructure
 */
public class BusinessReport
{
    
    private List<Staff> staff = new ArrayList<>();
    
    public BusinessReport()
    {
        staff.add(new Engineer("工程师-A"));
        staff.add(new Engineer("工程师-B"));
        staff.add(new Engineer("工程师-C"));
        staff.add(new Engineer("工程师-D"));
        
        staff.add(new Manager("经理-A"));
        staff.add(new Manager("经理-B"));
        staff.add(new Manager("经理-C"));
        
    }
    
    public void showReport(Visitor visitor)
    {
        for(Staff staff1 : staff)
        {
            staff1.accept(visitor);
        }
        
    }
}
