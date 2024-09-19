package ASSIGNMENT2;

public class Student {
    private String name;
    private int grade;

    // Constructor
    public Student(String name, int grade) {
        setName(name); // Use setter to enforce name validation
        setGrade(grade); // Use setter to enforce grade validation
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name with validation
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    // Getter for grade
    public int getGrade() {
        return grade;
    }

    // Setter for grade with validation
    public void setGrade(int grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

// Usage example

    public static void main(String[] args) {
        try {
            Student student = new Student("Rahul", 85);
            System.out.println(student);

            student.setGrade(95);
            System.out.println("Updated grade: " + student.getGrade());

            student.setName("Dev");
            System.out.println("Updated name: " + student.getName());

            // This will throw an exception
            student.setGrade(110); // Invalid grade
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Student student2 = new Student("", 90); // Invalid name
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

