package assignment5;

public class Candy extends DessertItem{
    private int price; //price per pound
    private double weight;

    public Candy(String name, double weight, int price) {
        super(name);
        if (name.length() > DessertShoppe.MAX_SIZE_OF_ITEM_NAME) {
            throw new IllegalArgumentException("Item name too long");
        }
        this.weight = weight;
        this.price = price;
    }

    @Override
    public int getCost() {
        return (int) Math.round(price * weight);
    }

    @Override
    public String toString() {
        String builder = weight +
                " lbs. " +
                " @ " +
                DessertShoppe.cents2dollarsAndCents(price) +
                " /lb.\n" +
                this.getName() +
                " " +
                DessertShoppe.cents2dollarsAndCents(this.getCost()) +
                "\n";
        return builder;
    }
}
