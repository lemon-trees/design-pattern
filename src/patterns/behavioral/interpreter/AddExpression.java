package patterns.behavioral.interpreter;

import java.math.BigDecimal;

public class AddExpression extends Expression
{
    
    private Expression left;
    
    private Expression right;
    
    public AddExpression(Expression left, Expression right)
    {
        this.left = left;
        this.right = right;
    }
    
    @Override
    public BigDecimal interpret(Context context)
    {
        return left.interpret(context).add(right.interpret(context));
    }
}
