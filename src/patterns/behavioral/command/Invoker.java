package patterns.behavioral.command;

import java.util.HashMap;
import java.util.Map;

public class Invoker
{
    private Map<String, Command> actionTypeCommandMap;
    
    public Invoker()
    {
        init();
    }
    
    private void init()
    {
        Light light = new Light();
        actionTypeCommandMap = new HashMap<>();
        actionTypeCommandMap.put("on", new LightOnCommand(light));
        actionTypeCommandMap.put("off", new LightOffCommand(light));
    }
    
    public void lightOn()
    {
        actionTypeCommandMap.get("on").execute();
    }
    
    public void lightOff()
    {
        actionTypeCommandMap.get("off").execute();
    }
    
}
