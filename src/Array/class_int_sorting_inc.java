package Array;

import java.util.Arrays;

public class class_int_sorting_inc 
{   
	public static void main(String[] args) {
		
	
	int [] ia = { 10, 25, 500, 2000};
	
	
	System.out.println("------ int ascening-----------");  
	
	for (int i=0; i<=ia.length-1; i++)       
	{ 
		System.out.println(ia[i]); 
	}

	
	
System.out.println("------------------------------------Sorting(permanent change)--------------------------");	
	
	Arrays.sort(ia);                                                       
	
	System.out.println("------Sorting int ascening-----------");
	
	for (int i=0; i<=ia.length-1; i++)         
	{
		System.out.println(ia[i]); 
	}

	
   }
}
