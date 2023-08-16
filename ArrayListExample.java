import java.io.*; 
import java.util.*; 
//import java.util.ArrayList;
  
                
		
							 //Java ArrayList class uses a dynamic array for storing the elements. 

								//It is like an array, but there is no size limit. 

									//We can add or remove elements anytime.

class ArrayListExample {

	 public static void main(String[] a)  { 
        
        int n = 5;
		 
        // Declaring the ArrayList with 
        
        ArrayList<Integer> ar_list= new ArrayList<Integer>(n); 
  
        // Appending at the end of the list 

        for (int i = 0; i < n; i++) 
		
            ar_list.add(i*i+5); 
  
       					 // Printing elements 
        System.out.println(ar_list); 
  
       					 // Remove element at index 3 
        ar_list.remove(3); 
  
        // Displaying the ArrayList after deletion 
        System.out.println(ar_list); 
  

	ar_list.remove(2); 

        // Printing elements one by one 
        for (int i = 0; i < ar_list.size(); i++) 
            System.out.print(ar_list.get(i) + " "); 
    } 
} 
