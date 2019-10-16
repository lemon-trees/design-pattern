package patterns.behavioral.interpreter;

import java.math.BigDecimal;

/**
 * 解释器模式：抽象表达式，终结表达式，非终结表达式，环境上下文
 */
public class Client
{
    
    /**
     * 生成：(a+b)/(a-b) 表达式
     * 
     * @return
     */
    private static Expression buildExpression()
    {
        VarialbeExpression a = new VarialbeExpression("a");
        VarialbeExpression b = new VarialbeExpression("b");
        VarialbeExpression c = new VarialbeExpression("c");
        
        Expression addExpression = new AddExpression(a, b);
        Expression subExpression = new SubtractExpression(a, b);
        Expression mutiplyExpression = new MutilplyExpression(addExpression, subExpression);
        return mutiplyExpression;
        
    }
    
    public static void main(String[] args)
    {
        
        Context context = new Context();
        context.addValue("a", new BigDecimal("1"));
        context.addValue("b", new BigDecimal("2"));
        context.addValue("c", new BigDecimal("3"));
        
        System.out.println(buildExpression().interpret(context).intValue());
        
    }
    
}
