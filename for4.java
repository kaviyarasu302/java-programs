import java.util.*;

public class Main
{

	public static void main(String[] args) {

	    Scanner sc=new Scanner(System.in);
	  
 System.out.print("enter num:");
	
    int num=sc.nextInt();
	
    int sum=0;
	 
   for(int i=1;i<=5;i++){


	        sum+=num%10;
	
        num=num/10;
	
    }
	
       System.out.println(sum); 
	
   }
		

}
