package patterns.behavioral.chainOfResponsibility;

/**
 * 责任链模式:编排处理链路，解耦客户端和接收者
 */
public class Client
{
    
    public static void main(String[] args)
    {
        Handler handler = HandlerFactory.initHandler();
        handler.handle(new Request("handler3", "data"));
    }
    
}
