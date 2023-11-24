package laboratoryexercisefinalsno_1;

public class Instructor extends Person {
    private double salary;

    public Instructor(String name, int yearOfBirth, double salary) {
        super(name, yearOfBirth);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Instructor |Name= " + getName() + ", YearOfBirth= " + getYearOfBirth() + ", Salary= " + salary + "|";
    }
}
