import java.util.Scanner;


public class Main {
   
 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
   
   System.out.print("Enter a number : ");
 
       int num = sc.nextInt();
    
    int original = num;
     
   int rev = 0;

      
  while (num != 0) {
      
      int digit = num % 10;
       
     rev= rev* 10 + digit;
  
          num /= 10;
      
  }

     
   if (original == rev) {
     
       System.out.println(" Palindrome");
       
 } 
else {
      
      System.out.println("Not a Palindrome");
    
    }

       
 
   }

}