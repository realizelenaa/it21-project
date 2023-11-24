package inheritance;

public class Main {
    
    public static void main(String[] args){
        
        Parent myParent = new Parent("Joy");
        
        myParent.cook();
        myParent.clean();
        
        Child myChild = new Child("Baby Raiden");
        
        myChild.play();
        myChild.eat();
    }  
}