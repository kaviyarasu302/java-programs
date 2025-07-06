import java.util.Scanner;


public class Main {
 
   public static void main(String[] args) {
     
   Scanner scanner = new Scanner(System.in);

      
  System.out.print("Enter color code (R, B, G, O, Y, W): ");
       
 char colorCode = scanner.next().toUpperCase().charAt(0); 

      
  switch (colorCode) {
    
        case 'R':
         
       System.out.println("Output: Red");
        
        break;
   
         case 'B':
         
       System.out.println("Output: Blue");
      
          break;
          
         case 'G':
        
       System.out.println("Output: Green");
        
        break;
         
         case 'O':
             
      System.out.println("Output: Orange");
         
       break;
        
         case 'Y':
           
     System.out.println("Output: Yellow");
      
          break;
         
         case 'W':
       
     System.out.println("Output: White");
  
            break;
           
 default:
              
  System.out.println("Output: Invalid Code");
      
  }

       
 
    }

}
