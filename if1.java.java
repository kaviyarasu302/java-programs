import java.util.Scanner;
public class positiveNegative
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter num:");
	    int num=sc.nextInt();
	    if(num>0){
	        System.out.println("positive");
	    }
	    else if(num<0){
	        System.out.println("negative");
	    }
	    else
		System.out.println("zero");
	}
}
