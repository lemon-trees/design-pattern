package patterns.behavioral.chainOfResponsibility;

public class RequestHandler2 extends Handler
{
    
    public RequestHandler2(Handler handler, String type)
    {
        super(handler, type);
    }
    
    @Override
    public void handlerRequest(Request request)
    {
        System.out.println(" handler2 handle request " + request.getData());
    }
}
