package IceCream;

public class Main {

    public static void main(String[] args) {
        IceCream iceCream = new IceCream();
        iceCream.setName("Пломбир");
        iceCream.setNumber(50); // цена мороженного

        Mom mom = new Mom();
        mom.setName("Оля");

        Children children = new Children();
        children.setName("Саша");
        children.setNumber(6); // возраст ребенка
        children.eat(iceCream.getName());

        mom.buy(iceCream, children);
        children.eat(iceCream.getName());
    }
}