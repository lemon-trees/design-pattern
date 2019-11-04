package patterns.structure.composite;

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void print(int level) {

        for (int i = 0; i < level; i++) {
            System.out.println("--");
        }
        System.out.println("leafName:"+name);

    }

    @Override
    public void add(Component component) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException();
    }
}
