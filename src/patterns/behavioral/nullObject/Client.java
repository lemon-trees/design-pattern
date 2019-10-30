package patterns.behavioral.nullObject;

/**
 * 空对象模式,优雅处理null问题
 */
public class Client
{
    public static void main(String[] args)
    {
        AbstractOperation abstractOperation = fun(-1);
        abstractOperation.request();
    }
    
    public static AbstractOperation fun(int arg)
    {
        if(arg < 0)
        {
            return new NullOperation();
        }
        return new RealOperation();
        
    }
}
