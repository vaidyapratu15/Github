package Array;

import java.util.Arrays;

public class String_sorting_dec
{
	public static void main(String[] args) {
		
		
		
		String [] sa = {"Pratiksha" , "Pallavi", "Pratibha" }; 
		
		
		System.out.println("------String descening-----------");
		
		for (int i=sa.length-1; i>=0; i--)        
		{ 
			System.out.println(sa[i]); 
		}
		
	System.out.println("------------------------------------Sorting(permanent change)--------------------------");	
		
		Arrays.sort(sa);
		
	
		System.out.println("------sorting String descening-----------");
		
		for (int i=sa.length-1; i>=0; i--)    
		{ 
			System.out.println(sa[i]);
		}
		
		
	   }
}
