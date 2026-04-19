package Tasks_one;

public class Student {

    // Private variables (Encapsulation)
    private String name;
    private int rollNo;
    private double marks;

    // Getter methods
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getMarks() {
        return marks;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        // Setting values using setters
        s1.setName("Vikash");
        s1.setRollNo(101);
        s1.setMarks(88.5);

        // Getting values using getters
        System.out.println("Name: " + s1.getName());
        System.out.println("Roll No: " + s1.getRollNo());
        System.out.println("Marks: " + s1.getMarks());
    }
}

