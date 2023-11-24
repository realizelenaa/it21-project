package laboratoryexercisefinalsno_1;

public class Main {
    public static void main(String[] args) {
        //main class
        Student student = new Student("Elena A. Realisan", 2002, "Programming");

        System.out.println("Student Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Year of Birth: " + student.getYearOfBirth());
        System.out.println("Major: " + student.getMajor());
        System.out.println(student);

        System.out.println();

        Instructor instructor = new Instructor("Ma'am Phoebe", 1989, 90000.0);

        System.out.println("Instructor Information:");
        System.out.println("Name: " + instructor.getName());
        System.out.println("Year of Birth: " + instructor.getYearOfBirth());
        System.out.println("Salary: P" + instructor.getSalary());
        System.out.println(instructor);
    }
}
