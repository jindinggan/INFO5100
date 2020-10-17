package assignment5;

public class Cookie extends DessertItem{
    private int price; //price per dozen
    private int number;

    public Cookie(String name, int number, int price) {
        super(name);
        this.number = number;
        this.price = price;
    }

    @Override
    public int getCost() {
        int cost = (int) Math.round((this.number * 1.0) / 12 * this.price);
        return (int) Math.round(cost + cost * DessertShoppe.TAX);
    }
}
