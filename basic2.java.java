public class integercommandargs
{

	public static void main(String[] args) {

       if(args.length>0){
	       
       int num1=Integer.parseInt(args[0]);
	 
       int num2=Integer.parseInt(args[1]);
	
        int sum=num1+num2;
	        
System.out.print("sum is"+sum);
	   
     
	    }
	 
   else{
	       
 System.out.println("pass the two integer arguments");
	
    }
	        
	 
   }
		
	
}


