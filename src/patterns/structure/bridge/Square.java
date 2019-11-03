package patterns.structure.bridge;

public class Square extends Shape {
    @Override
    public void draw() {
        super.color.bepaint("square");
    }
}
