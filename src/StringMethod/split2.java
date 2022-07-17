package StringMethod;

public class split2 
{
	public static void main(String[] args)
	{  
		
		 
			   String s1 ="pratiksha , laxman , vaidya";
			   String [] ar = s1.split(",");
			   
			   for (int i=0; i<=ar.length-1; i++) {System.out.println(ar[i]);}    System.out.println();
			   
			   for (int i=ar.length-1; i>=0; i--) {System.out.println(ar[i]); }
		
	}
}
