package entities;

public class Student {
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade1() {
        return grade1;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public double getGrade3() {
        return grade3;
    }

    public void setGrade3(double grade3) {
        this.grade3 = grade3;
    }

    public double finalGrade() {
        return this.grade1 + this.grade2 + this.grade3;
    }

    public void missingPoints() {
        if (this.finalGrade() >= 60) {
            System.out.println("PASS");
        } else {
            double missing = 60 - this.finalGrade();
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", missing);
        }
    }
}
