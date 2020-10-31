package assignment6.partC;

public class Cat extends Pet implements Boardable{
    private String hairLength;
    private int startMonth, startDay, startYear;
    private int endMonth, endDay, endYear;

    public Cat(String petName, String ownerName, String color, String hairLength) {
        super(petName, ownerName, color);
        this.hairLength = hairLength;
    }

    public String getHairLength() {
        return hairLength;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CAT:" + "\n");
        builder.append(this.getPetName() + " owned by " + this.getOwnerName() + "\n");
        builder.append("Color: " + this.getColor() + "\n");
        builder.append("Sex: " + getSex() + "\n");
        builder.append("Hair: " + hairLength);
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
