package polymorphism;

public class ChildClass1 extends ParentClass{
    ChildClass1(String name){
        super(name);
    }
    void music(){
        System.out.println(name + " likes to listen BlackPink playlist.");
    }
    public void parentclassNoisy(){
        System.out.println("Gikasab-an ni sir kay grabe ka saba si " + name);
    }
}
