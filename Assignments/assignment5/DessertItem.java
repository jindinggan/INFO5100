package assignment5;

public abstract class DessertItem extends java.lang.Object{
    protected String name;

    public DessertItem() {

    }

    public DessertItem(String name) {
        this.name = name;
    }

    public final String getName() {
        return this.name;
    }

    public abstract int getCost();

    @Override
    public abstract String toString();
}
