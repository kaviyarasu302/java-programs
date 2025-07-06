import java .util.*;

public class Main {
  
  public static void main(String[] args) {
 
       Scanner sc =new Scanner(System.in);
      
  System.out.print("enter string:");
   
     String gender=sc.nextLine();
      
  System.out.print("enter the age:");
       
  int age = sc.nextInt();

      
  if (gender.equalsIgnoreCase("Female")) {
   
         if (age >= 1 && age <= 58) {
      
          System.out.println(" 8.2%");
     
       } 
   else if (age >= 59 && age <= 100) {
  
              System.out.println( "9.2%");
       
     }
       
 }
   else if (gender.equalsIgnoreCase("Male")) {
  
          if (age >= 1 && age <= 58) {
    
            System.out.println("8.4%");
        
    } 
  else if (age >= 59 && age <= 100) {
      
          System.out.println("10.5%");
        
    }
      
  } 
  else {
         
   System.out.println(" Invalid input");
    
    }
  
  }

}