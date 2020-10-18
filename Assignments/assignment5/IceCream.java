package assignment5;

public class IceCream extends DessertItem{
    private int price;

    public IceCream(String name, int price) {
        super(name);
        if (name.length() > DessertShoppe.MAX_SIZE_OF_ITEM_NAME) {
            throw new IllegalArgumentException("Item name too long");
        }
        this.price = price;
    }

    @Override
    public int getCost() {
        return this.price;
    }

    @Override
    public String toString() {
        String builder = name +
                " " +
                DessertShoppe.cents2dollarsAndCents(this.getCost()) +
                "\n";
        return builder;
    }
}
