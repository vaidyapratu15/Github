package Array;

import java.util.Arrays;

public class string_sorting_inc
{
	public static void main(String[] args) {
		
		
		String [] sa = {"Pratu" , "Rani", "Queen" }; 
		
		
		System.out.println("------ String ascening-----------");
		
		for (int i=0; i<=sa.length-1; i++)      
		{ 
			System.out.println(sa[i]); 
		}
		
	System.out.println("------------------------------------Sorting(permanent change)--------------------------");	
		
		
		Arrays.sort(sa);
		
		System.out.println("------Sorting String ascening-----------");
		
		for (int i=0; i<=sa.length-1; i++)        
		{ 
			System.out.println(sa[i]);
		}
		
		
	   }
}
