import java.util.Scanner;
public class Exceptioninteger

{
  
  public static void main(String args[])
  
  {
  
  	Scanner sc = new Scanner(System.in);
  
  	System.out.println("No of +ve integers:");
  	
  	int n =  sc.nextInt();
  	
  	int flag=0,sum=0;
  	
  	sc.nextLine();
  	
  	int[] integers = new int[n];
    
   	for(int i=0;i<n;i++)
   	
   	{
   	
   		System.out.println("Enter +ve integer:"+(i+1)+":");
   		
   		int x = sc.nextInt();
   		
   		try{
   		
   			if(x<=0)
   		
   			{
   			
   				throw new ArithmeticException("negative Number");
   		
   			}
   		
   		}
   		
   		catch(ArithmeticException e)
   		
   		{
   			
   			System.out.println(e);
   			
   		
   		
   			
    
  		}
  		
  		integers[i] = x;
  		
  	}
  	
  	for(int i=0;i<n;i++)
   	
   	{
   	
   		if(integers[i] > 0)
   		
   		{
   			flag++;
   			
   			sum = sum + integers[i];
   			
   		}
   		
   	}
   	
   	int avg = sum/flag;
   	
   	System.out.println("AVERAGE OF +VE NOS:"+avg);
   	
  	  
}
} 
 
