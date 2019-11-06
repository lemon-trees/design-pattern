package patterns.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private Map<String,Flyweght> flyweghtMap = new HashMap<>();

    public Flyweght getFlyweight(String intrinsicState){
        if(!flyweghtMap.containsKey(intrinsicState)){
            Flyweght flyweght = new ConcreteFlyweight(intrinsicState);
            flyweghtMap.put(intrinsicState,flyweght);
        }
        return flyweghtMap.get(intrinsicState);

    }


}
