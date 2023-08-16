class ThreadDemo{

  	public static void main(String args[]) {
   
		mythread m=new mythread();
  
		 m.start();/* Works only when mythread class extends Thread class*/
	
		try{
	
		Thread.sleep(12);

	}catch(InterruptedException ie){System.out.print(ie);}
								/* m.run();doesn't work*/

		m.setName(" S2MCA ");

 		System.out.println("\n The Name of the Thread displayed through main method is="+m.getName());
   
  }//main

}//ThreadDemo


class mythread extends Thread{

		//mythread(String d){
			
		mythread(){
		
			//super(d); 
		
			System.out.print("\n Thread inside constructor and name is="+Thread.currentThread().getName());
		}
  
	
		public void run()    {
		/* Use try catch if a sleep method is used in run()*/
     
     
		System.out.println("\nThe Name of the Thread is="+Thread.currentThread().getName());
	

		//Ex_sleep();
       
 	   }

	void Ex_sleep(){
	
	System.out.println("Inside Ex_sleep");
	
	try{
	
		Thread.sleep(12);

	}catch(InterruptedException ie){System.out.print(ie);}
	}//Ex_sleep()

}//mythread
