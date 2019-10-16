package patterns.behavioral.interpreter;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 环境上下文
 */
public class Context
{
    
    private final Map<String, BigDecimal> MAP = new HashMap<>();
    
    public void addValue(String key, BigDecimal value)
    {
        assert null != key;
        assert null != value;
        MAP.put(key, value);
    }
    
    public BigDecimal getValue(String key)
    {
        return MAP.get(key);
    }
    
}
