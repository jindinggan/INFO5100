package assignment3;

public class Test {
    public static void main(String[] args) {
        Student a = new Student("a", "001");
        Student b = new Student("b", "002");
        Student c = new Student("c", "003");
        Student d = new Student("d", "004");
        Student e = new Student("e", "005");
        Student f = new Student("f", "006");
        Student g = new Student("g", "007");
        Student h = new Student("h", "008");
        Student i = new Student("i", "009");
        Student j = new Student("j", "010");
        Student k = new Student("k", "011");
        Course info5100 = new Course("INFO5100");
        info5100.registerStudent(a);
        info5100.registerStudent(b);
        info5100.registerStudent(c);
        info5100.registerStudent(d);
        info5100.registerStudent(e);
        info5100.registerStudent(f);
        info5100.registerStudent(g);
        info5100.registerStudent(h);
        info5100.registerStudent(i);
        info5100.registerStudent(j);
        System.out.print("The list of students who registered INFO5100 are: ");
        for (int count = 0; count < info5100.getNumberOfStudent(); count++) {
            System.out.print(info5100.getStudents()[count].getName() + " ");
        }
        System.out.println();
        try {
            info5100.registerStudent(k);
        } catch (Exception exception) {
            System.out.println("Failed to register student " + k.getName() + " because the course " +
                    info5100.getName() + " is full");
        }

        // Following code implements the Professor and Builder class
        Professor professor = new Professor.Builder("Simon", "Jin", "1000")
                .setAddress("1000 NE Seattle WA")
                .setPhone("2061234567").build();
        System.out.println("Professor " + professor.getFirstName() + " " + professor.getLastName() +
                 " is created using Builder pattern");
    }
}
