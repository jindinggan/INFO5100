package assignment5;

public class Sundae extends IceCream{

    public Sundae(String name, int price, String topping, int toppingPrice) {
        super(name, price + toppingPrice);
    }


}
