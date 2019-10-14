package patterns.behavioral.chainOfResponsibility;

/**
 * 编排并生成处理责任链路
 */
public class HandlerFactory
{
    public static Handler initHandler()
    {
        Handler handler2 = new RequestHandler2(null,"handler2");
        Handler handler1 = new RequestHandler1(handler2,"handler1");
        return handler1;
        
    }
    
}
