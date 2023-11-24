package polymorphism;

public class ParentClass {
    String name;
    ParentClass(String name){
        this.name = name;
    }
    void eat(){
        System.out.println(name + " is eating an apple.");
    }
    void sleep(){
        System.out.println(name + " is sleeping in the room.");
    }
    void code(){
        System.out.println(name + " is copy pasting everything.");
    }
    void music(){
        System.out.println(name + " likes to listen BlackPink playlist.");
    }
    public void parentclassNoisy(){
        System.out.println("Gikasab-an ni sir kay grabe ka saba si " + name);
    }
}
