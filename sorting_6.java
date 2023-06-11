import java.util.*;
public class sorting_6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of strings:");
		int n=sc.nextInt();
		sc.nextLine();
		String[] strings=new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Strings"+(i+1)+":");
			strings[i]=sc.nextLine();
		}	
		Arrays.sort(strings);
		System.out.println("Sorted Strings");
		for(String str:strings)
		{
			System.out.println(str);
		}
	}
}