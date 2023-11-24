package polymorphism;

public class MainClass {

    public static void main(String[] args) {
        ParentClass my_love = new ParentClass("Ariel");
        ChildClass1 my_self = new ChildClass1("Elena");
        ChildClass2 my_friend = new ChildClass2("Joyce");
        
        my_love.sleep();
        my_self.music();
        my_friend.eat();
        
        System.out.println("--------------------------------------------");
        
        my_love.code();
        my_self.parentclassNoisy();
        my_friend.parentclassNoisy();
                
    }
    
}
