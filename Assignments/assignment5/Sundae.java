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
        StringBuilder builder = new StringBuilder();
        builder.append(topping);
        builder.append(" Sundae with\n");
        builder.append(name);
        builder.append(" ");
        builder.append(DessertShoppe.cents2dollarsAndCents(this.getCost()));
        builder.append("\n");
        return builder.toString();
    }

}
