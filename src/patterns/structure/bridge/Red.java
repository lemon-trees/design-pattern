package patterns.structure.bridge;

public class Red implements Color {
    @Override
    public void bepaint(String shape) {
        System.out.println(" 红色的 "+shape);
    }
}
