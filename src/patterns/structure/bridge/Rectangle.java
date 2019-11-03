package patterns.structure.bridge;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        super.color.bepaint("rectangle");
    }
}
