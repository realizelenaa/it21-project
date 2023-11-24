package students;

class StudentsMain {
    
    public static void main(String[] args) {

        Student student = new Student("Elena A. Realisan", "IT21C", "Do not do to others what you don't want others do unto you.");

        System.out.println("Name: " + student.getName());
        System.out.println("Section: " + student.getSection());
        System.out.println("Motto: " + student.getMotto());
    }
}