import java.util.*;
public class searchelement_7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of the array:");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<size;i++)
		{
			System.out.print("Elements"+(i+1)+":");
			array[i]=sc.nextInt();
		}
		System.out.println("Enter element to search for:");
		int target=sc.nextInt();
                     boolean found=false;
		for(int i=0;i<size;i++)
		{
			if(array[i]==target)
			{
				found=true;
				break;
			}
		}
		if (found==true)
		{
			System.out.print("Element found in the array:");
		}
		else
		{
			System.out.print("Element not found in the array:");
		}
	}
}	
		