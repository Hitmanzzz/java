import java.util.Scanner;

import java.io.*;

class Voting_Right extends Exception{

	Voting_Right(String s)

	{

		super(s);

		//super();

	}

}

class User_Def_Excep{

	public static void main(String str[])

	{

		try{

			Scanner s=new Scanner(System.in);

			System.out.println("Enter an integer value");

			int d=s.nextInt();

			Check(d);

		}

		catch(Voting_Right n){

			System.out.println("Denied because of ..."+n);

				     }

	}

	static void Check(int x) throws Voting_Right

	{

		if(x<18)

			{

		           //Voting_Right v=new voting("sorry you have to wait till 18");

		           throw new Voting_Right("sorry you have to wait till 18");

		        }

		else

		System.out.println("You can vote");

	}

}
			
		
		   
			
