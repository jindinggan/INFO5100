package assignment5;

public class Cookie extends DessertItem{
    private int price; //price per dozen
    private int number;

    public Cookie(String name, int number, int price) {
        super(name);
        if (name.length() > DessertShoppe.MAX_SIZE_OF_ITEM_NAME) {
            throw new IllegalArgumentException("Item name too long");
        }
        this.number = number;
        this.price = price;
    }

    @Override
    public int getCost() {
        return (int) Math.round((price * 1.00) / 12 * number);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(number);
        builder.append(" @ ");
        builder.append(DessertShoppe.cents2dollarsAndCents(price));
        builder.append(" /dz.\n");
        builder.append(this.getName());
        builder.append(" ");
        builder.append(DessertShoppe.cents2dollarsAndCents(this.getCost()));
        builder.append("\n");
        return builder.toString();
    }

}
