package patterns.behavioral.interpreter;

import java.math.BigDecimal;

public class DivisionExpression extends Expression
{
    
    private Expression left;
    
    private Expression right;
    
    public DivisionExpression(Expression left, Expression right)
    {
        this.left = left;
        this.right = right;
    }
    
    @Override
    public BigDecimal interpret(Context context)
    {
        if(!right.interpret(context).equals(new BigDecimal("0")))
        {
            return left.interpret(context).divide(right.interpret(context));
        }
        return new BigDecimal("0");
    }
}
