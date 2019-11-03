package patterns.structure.bridge;

public class Circle extends Shape {

    @Override
    public void draw() {
        super.color.bepaint("circle");
    }
}
