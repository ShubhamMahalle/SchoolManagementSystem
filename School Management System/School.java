// School.java
import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = new ArrayList<>(teachers);
        this.students = new ArrayList<>(students);
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
    }

    public List<Teacher> getTeachers() {
        return new ArrayList<>(teachers);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        teachers.removeIf(t -> t.getId() == teacher.getId());
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.removeIf(s -> s.getId() == student.getId());
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void updateTotalMoneyEarned(int moneyEarned) {
        this.totalMoneyEarned += moneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public void updateTotalMoneySpent(int moneySpent) {
        this.totalMoneySpent += moneySpent;
        this.totalMoneyEarned -= moneySpent;
    }

    @Override
    public String toString() {
        return "School{teachers=" + teachers.size() + ", students=" + students.size() + 
               ", totalMoneyEarned=" + totalMoneyEarned + ", totalMoneySpent=" + totalMoneySpent + "}";
    }
}