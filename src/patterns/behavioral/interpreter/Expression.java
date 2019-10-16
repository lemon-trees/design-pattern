package patterns.behavioral.interpreter;

import java.math.BigDecimal;

public abstract class Expression
{
    
    public abstract BigDecimal interpret(Context context);
    
}
