package patterns.creational.prototype;

import java.util.List;

public class Prototype implements Cloneable {


    private String name;

    private List<String> attrs;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAttrs() {
        return attrs;
    }

    public void setAttrs(List<String> attrs) {
        this.attrs = attrs;
    }

    @Override
    protected Prototype clone() {
        try {

            return (Prototype) super.clone();

        } catch (CloneNotSupportedException e) {

            return null;

        }
    }
}
