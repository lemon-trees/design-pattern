package patterns.behavioral.chainOfResponsibility;

public abstract class Handler
{
    private Handler nextHandler;
    
    private String type;
    
    public Handler(Handler nextHandler, String type)
    {
        this.nextHandler = nextHandler;
        this.type = type;
    }
    
    public abstract void handlerRequest(Request request);
    
    public final void handle(Request request)
    {
        if(request.getType().equals(this.type))
        {
            this.handlerRequest(request);
        }
        else
        {
            if(null != this.nextHandler)
            {
                this.nextHandler.handle(request);
            }
            else
            {
                System.out.println("没有对应的handler");
            }
        }
        
    }
}
