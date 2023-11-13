package IceCream;

public class Mom {

    public Mom() {
    }

    public Mom(String name, IceCream iceCream) {
        this.name = name;
        this.iceCream = iceCream;
    }

    private String name;
    private IceCream iceCream;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void buy() {
        if (iceCream != null) {
            System.out.println(name + " купила мороженое " + iceCream.getName());
        } else {
            System.out.println(name + "не купила мороженое");
        }
    }
    public void setIceCream(IceCream iceCream){
        this.iceCream = iceCream;
    }
}
