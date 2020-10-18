package assignment5;

public class Sundae extends IceCream{
    private String topping;

    public Sundae(String name, int price, String topping, int toppingPrice) {
        super(name, price + toppingPrice);
        if (name.length() > DessertShoppe.MAX_SIZE_OF_ITEM_NAME) {
            throw new IllegalArgumentException("Item name too long");
        }
        this.topping = topping;
    }

    @Override
    public String toString() {
        String builder = topping +
                " Sundae with\n" +
                name +
                " " +
                DessertShoppe.cents2dollarsAndCents(this.getCost()) +
                "\n";
        return builder;
    }

}
