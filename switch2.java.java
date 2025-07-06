import java.util.Scanner;


public class Main {
  
  public static void main(String[] args) {
   
     Scanner scanner = new Scanner(System.in);

  
      System.out.print("Enter month number (1 to 12): ");

        int month = scanner.nextInt();

      
 switch (month) {
     
       case 1:
              
  System.out.println("Output: January");
   
             break;
            
case 2:
               
 System.out.println("Output: February");
          
      break;
          
 case 3:
            
    System.out.println("Output: March");
        
        break;
       
     case 4:
               
 System.out.println("Output: April");
   
             break;
     
       case 5:
          
      System.out.println("Output: May");
   
             break;
           
 case 6:
               
 System.out.println("Output: June");
      
          break;
          
 case 7:
           
     System.out.println("Output: July");
     
           break;
         
 case 8:
    
            System.out.println("Output: August");
 
               break;
           
 case 9:
     
           System.out.println("Output: September");
    
            break;
      
 case 10:
         
       System.out.println("Output: October");
  
              break;
          
case 11:
         
       System.out.println("Output: November");
   
             break;
          
case 12:
             
   System.out.println("Output: December");
       
         break;
         
   default:
             
   System.out.println("Output: Invalid Month");
    
    }

       
 
   }

}