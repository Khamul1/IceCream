package IceCream;

public class IceCream {
    public IceCream() {
    }

    public IceCream(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public IceCream(String name, int number, String taste){
    }
    private String name;
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
