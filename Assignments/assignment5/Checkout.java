package assignment5;

import java.util.ArrayList;

public class Checkout {
    private final ArrayList<DessertItem> items;

    public Checkout() {
        items = new ArrayList<>();
    }

    public void enterItem(DessertItem item) {
        items.add(item);
    }

    public int numberOfItems() {
        return items.size();
    }

    public void clear() {
        items.clear();
    }

    public int totalCost() {
        int cost = 0;
        for (DessertItem item : items) {
            cost += item.getCost();
        }
        return cost;
    }

    public int totalTax() {
        return (int) Math.round(this.totalCost() * DessertShoppe.TAX);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Number of items: ");
        builder.append(this.numberOfItems());
        builder.append("\n");
        builder.append("Total cost: ");
        builder.append(this.totalCost());
        builder.append("\n");
        builder.append("Total tax: ");
        builder.append(this.totalTax());
        builder.append("\n");
        builder.append("Cost + tax: ");
        builder.append(this.totalCost() + this.totalTax());
        builder.append("\n");
        builder.append(DessertShoppe.NAME_OF_STORE);
        builder.append("\n");
        builder.append("--------------------");
        builder.append("\n");
        builder.append("\n");
        for (DessertItem item : items) {
            builder.append(item.toString());
        }
        builder.append("Tax ");
        builder.append(DessertShoppe.cents2dollarsAndCents(this.totalTax()));
        builder.append("\n");
        builder.append("Total Cost ");
        builder.append(DessertShoppe.cents2dollarsAndCents(this.totalTax() + this.totalCost()));
        builder.append("\n");
        return builder.toString();
    }
}
