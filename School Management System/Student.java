// Student.java
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesTotal = 30000;
        this.feesPaid = 0;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void updateFeesPaid(int fees) {
        this.feesPaid += fees;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', grade=" + grade + 
               ", feesPaid=" + feesPaid + ", feesTotal=" + feesTotal + "}";
    }
}