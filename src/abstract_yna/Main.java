package abstract_yna;

public class Main {
    public static void main(String[] args){
        
        Abstract_Ariel my_Ariel = new Abstract_Ariel();
        my_Ariel.studentStudy();
        my_Ariel.eat();
        
        Abstract_Elena my_Elena = new Abstract_Elena();
        my_Elena.studentStudy();
        my_Elena.sleep();      
        
    }
}
