package assignment5;

public class Candy extends DessertItem{
    private int price; //price per pound
    private double weight;

    public Candy(String name, double weight, int price) {
        super(name);
        this.weight = weight;
        this.price = price;
    }

    @Override
    public int getCost() {
        int cost = (int) Math.round(this.weight * this.price);
        return (int) Math.round(cost + cost * DessertShoppe.TAX);
    }
}
