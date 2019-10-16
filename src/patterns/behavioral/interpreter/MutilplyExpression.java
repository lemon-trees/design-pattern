package patterns.behavioral.interpreter;

import java.math.BigDecimal;

public class MutilplyExpression extends Expression
{
    
    private Expression left;
    
    private Expression right;
    
    public MutilplyExpression(Expression left, Expression right)
    {
        this.left = left;
        this.right = right;
    }
    
    @Override
    public BigDecimal interpret(Context context)
    {
        return left.interpret(context).multiply(right.interpret(context));
    }
}
