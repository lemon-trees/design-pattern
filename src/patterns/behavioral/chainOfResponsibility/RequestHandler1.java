package patterns.behavioral.chainOfResponsibility;

public class RequestHandler1 extends Handler
{
    public RequestHandler1(Handler handler, String type)
    {
        super(handler, type);
    }
    
    @Override
    public void handlerRequest(Request request)
    {
        System.out.println("handler1 handle request " + request.getData());
    }
}
