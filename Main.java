import java.util.ArrayList;
import java.util.List;

class Course {
    String courseName;
    int marks;

    public Course(String courseName, int marks) {
        this.courseName = courseName;
        this.marks = marks;
    }
}

class Student {
    String name;
    String program;
    int semester;
    List<Course> courses = new ArrayList<>();

    public Student(String name, String program, int semester) {
        this.name = name;
        this.program = program;
        this.semester = semester;
    }

    public void registerCourse(String courseName, int marks) {
        courses.add(new Course(courseName, marks));
    }

    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Courses Registered:");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }

    public void displayLowMarks() {
        System.out.println("Courses with marks less than 40:");
        for (Course c : courses) {
            if (c.marks < 40) {
                System.out.println(c.courseName + ": " + c.marks);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", "B.Sc. Computer Science", 3);
        student.registerCourse("Mathematics", 75);
        student.registerCourse("Data Structures", 35);
        student.registerCourse("Operating Systems", 28);

        student.displayStudentDetails();
        student.displayLowMarks();
    }
}
