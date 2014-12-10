import edu.fcps.karel2.Display; 
import edu.fcps.karel2.Robot;
import edu.fcps.Digit;


public class Lab11 {
	 
	 public static void main(String[] args) {
    
    Display.setSize(42, 37);
    Display.setSpeed(10);
            
    
    Digit first = new Four(1, 9);
    Digit second = new Nine(7, 9);
    Digit third = new Five(13, 9);
    Digit fourth = new Four(19, 9);
    Digit fifth = new Nine(25, 9);
    Digit sixth = new Five(31, 9);
    
    first.display();
    second.display();
    third.display();
    fourth.display();
    fifth.display();
    sixth.display();
   
	 }
	 
 }
