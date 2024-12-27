// Main.java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher(1, "John Doe", 50000);
        Teacher teacher2 = new Teacher(2, "Jane Smith", 55000);

        Student student1 = new Student(1, "Alice Johnson", 10);
        Student student2 = new Student(2, "Bob Williams", 11);

        School school = new School(Arrays.asList(teacher1, teacher2), Arrays.asList(student1, student2));

        System.out.println("School Management System");
        System.out.println("Teachers:");
        for (Teacher teacher : school.getTeachers()) {
            System.out.println(teacher);
        }
        System.out.println("Students:");
        for (Student student : school.getStudents()) {
            System.out.println(student);
        }
        System.out.println(school);
    }
}