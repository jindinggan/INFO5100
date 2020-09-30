package assignment3;

public class Course {
    private String name;
    private int numberOfStudent;
    private boolean isFull;
    private Student[] registeredStudent;

    Course(String name) {
        this.name = name;
        this.registeredStudent = new Student[10];
        this.numberOfStudent = 0;
        this.isFull = false;
    }

    public void registerStudent(Student student) {
        if (!this.isFull()) {
            this.registeredStudent[this.numberOfStudent] = student;
            this.numberOfStudent++;
        } else {
            throw new IllegalArgumentException(this.getName() + " is FULL!");
        }
    }

    public Student[] getStudents() {
        return this.registeredStudent;
    }

    public boolean isFull() {
        return this.numberOfStudent == 10;
    }

    public int getNumberOfStudent() {
        return this.numberOfStudent;
    }

    public String getName() {
        return this.name;
    }
}
