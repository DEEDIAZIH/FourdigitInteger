
package fourdigitinteger;
import java.util.Scanner;


public class FourdigitInteger {
    
    public static void main(String[] args) {
       
        Scanner keyboard = new Scanner(System.in);
       
        
        System.out.println("Enter a 4-digit integer");
        String number = keyboard.nextLine();
        String n1 = number.substring(0,1);
        String n2 = number.substring(1,2);
        String n3 = number.substring(2,3);
        String n4 = number.substring(3);
        
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        
        
       
      
       
         
                 
               
        
        
        
       
 
       
        
        
    }
    
}
