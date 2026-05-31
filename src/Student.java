public class Student {
    private String name;
    private double marks;
    private double cgpa;

    // Constructor
    public Student(String name, double marks, double cgpa) {
        this.name = name;
        this.marks = marks;
        this.cgpa = cgpa;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public double getCGPA() {
        return cgpa;
    }
}