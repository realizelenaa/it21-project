package inheritance;

public class Parent {
    String name;
    
    Parent(String name){
        this.name = name;
    }
    
    void cook(){
        System.out.println(name + " is cooking");
    }
    
    void clean(){
        System.out.println(name + " is cleaning");
    }
}