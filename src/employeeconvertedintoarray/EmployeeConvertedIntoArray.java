import java.time.LocalDate;

package employeeconvertedintoarray;

class EmployeeArray {    
    private final String name;
    private final double salary;
    private final LocalDate hireDate;

    protected EmployeeArray(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    protected String getName() {
        return name;
    }

    protected  double getSalary() {
        return salary;
    }

    protected  LocalDate getHireDate() {
        return hireDate;
    }
}