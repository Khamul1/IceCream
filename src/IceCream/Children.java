package IceCream;

public class Children {
    public Children() {
    }

    public Children(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Children(String name, IceCream iceCream, int number) {
        this.name = name;
        this.iceCream = iceCream;
        this.number = number;
    }

    public Children(String name, int number, IceCream iceCream) {

    }
    private String name;
    private IceCream iceCream;
    private int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void eat(String name){
        System.out.println(this.name + "ест мороженое " + name);
    }
}
