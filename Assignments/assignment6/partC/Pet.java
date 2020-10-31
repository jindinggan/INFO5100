package assignment6.partC;

public class Pet {
    private String petName;
    private String ownerName;
    private String color;
    protected int sex;
    public static final int MALE = 1;
    public static final int FEMALE = 2;
    public static final int SPAYED = 3;
    public static final int NEUTERED = 4;

    public Pet(String petName, String ownerName, String color) {
        this.petName = petName;
        this.ownerName = ownerName;
        this.color = color;
    }

    public String getPetName() {
        return petName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getColor() {
        return color;
    }

    public void setSex(int sexid) {
        sex = sexid;
    }

    public String getSex() {
        if (sex == MALE) {
            return "Male";
        } else if (sex == FEMALE) {
            return "Female";
        } else if (sex == SPAYED) {
            return "Spayed";
        } else if (sex == NEUTERED){
            return "Neutered";
        } else {
            return "Sex not set or invalid input for sex";
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(petName + " owned by " + ownerName + "\n");
        builder.append("Color: " + color + "\n");
        builder.append("Sex: " + getSex() + "\n");
        return builder.toString();
    }

    public static void main(String[] args) {
        Pet a = new Pet("lala", "simon", "black");
        System.out.println(a.toString());
    }
}
