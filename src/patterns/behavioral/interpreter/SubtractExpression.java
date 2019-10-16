package patterns.behavioral.interpreter;

import java.math.BigDecimal;

public class SubtractExpression extends Expression
{
    
    private Expression left;
    
    private Expression right;
    
    public SubtractExpression(Expression left, Expression right)
    {
        this.left = left;
        this.right = right;
    }
    
    @Override
    public BigDecimal interpret(Context context)
    {
        return left.interpret(context).subtract(right.interpret(context));
    }
}
