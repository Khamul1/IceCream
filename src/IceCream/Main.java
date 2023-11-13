package IceCream;

public class Main {

    public static void main(String[] args) {
        IceCream iceCream = new IceCream();
        iceCream.setName("Пломбир");
        iceCream.setNumber(50);

        Mom mom = new Mom();
        mom.setName("Оля");
        mom.setIceCream(iceCream);
        mom.buy();

        Children children = new Children();
        children.setName("Саша ");
        children.setNumber(6);
        children.eat(iceCream.getName());
    }
}