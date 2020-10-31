package assignment6.partC;

public class Dog extends Pet implements Boardable{
    private String size;
    private int startMonth, startDay, startYear;
    private int endMonth, endDay, endYear;

    public Dog(String name, String ownerName, String color, String size) {
        super(name, ownerName, color);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DOG:" + "\n");
        builder.append(this.getPetName() + " owned by " + this.getOwnerName() + "\n");
        builder.append("Color: " + this.getColor() + "\n");
        builder.append("Sex: " + getSex() + "\n");
        builder.append("Size: " + size);
        return builder.toString();
    }

    @Override
    public void setBoardStart(int month, int day, int year) {
        if (month > 12 || month < 1 || day > 31 || day < 1 || year < 2010 || year > 2020) {
            throw new IllegalArgumentException("Invalid start date!");
        }
        startMonth = month;
        startDay = day;
        startYear = year;
    }

    @Override
    public void setBoardEnd(int month, int day, int year) {
        if (month > 12 || month < 1 || day > 31 || day < 1 || year < 2010 || year > 2030) {
            throw new IllegalArgumentException("Invalid end date!");
        }
        endMonth = month;
        endDay = day;
        endYear = year;
    }

    @Override
    public boolean boarding(int month, int day, int year) {
        if (startMonth <= month && month <= endMonth &&
                startYear <= year && year <= endYear &&
                startDay <= day && day <= endDay) {
            return true;
        } else {
            return false;
        }
    }

}
