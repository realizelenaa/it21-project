package inheritance;

public class Child extends Parent{
    Child(String name){
        super(name);
    }
    
    void play(){
        System.out.println(name + " is playing");
    }
    
    void eat(){
        System.out.println(name + " is eating");
    }
}