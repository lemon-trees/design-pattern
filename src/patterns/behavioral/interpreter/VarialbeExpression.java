package patterns.behavioral.interpreter;

import java.math.BigDecimal;

/**
 * 终结表达式
 */
public class VarialbeExpression extends Expression
{
    
    private String name;
    
    public VarialbeExpression(String name)
    {
        this.name = name;
    }
    
    @Override
    public BigDecimal interpret(Context context)
    {
        return context.getValue(name);
    }
}
