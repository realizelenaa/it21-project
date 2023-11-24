package polymorphism;

public class ChildClass2 extends ParentClass{
    ChildClass2(String name){
        super(name);
    }
    void sleep(){
        System.out.println(name + " is sleeping in the room.");
    }
    public void parentclassNoisy(){
        System.out.println("Gikasab-an ni sir kay grabe ka saba si " + name);
    }
}
