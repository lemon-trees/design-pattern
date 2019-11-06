package patterns.structure.flyweight;

public class ConcreteFlyweight implements Flyweght {


    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void doOperation(String extrinsicState) {
        System.out.println("object address:"+System.identityHashCode(this));
        System.out.println("intrinsicState:"+intrinsicState);
        System.out.println("extrinsicState:"+extrinsicState);

    }
}
