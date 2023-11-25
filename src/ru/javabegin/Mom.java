package IceCream;

public class Mom {

    public Mom() {
    }

    public Mom(String name, IceCream iceCream) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void buy(IceCream iceCream, Children children) {
            System.out.println(name + " купила мороженое " + iceCream.getName() + " для " + children.getName());
        }
    }