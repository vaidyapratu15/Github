package StringMethod;

public class split_reverse
{
	  public static void main(String[] args) 
	   {
	              String s1 = "myZnameZisZpratiksha";
	              String [] ar = s1.split("Z");   
	   
	              System.out.println(ar[3]);     // pratiksha
	              System.out.println(ar[2]);
	              System.out.println(ar[0]);
	              System.out.println(ar[1]);
	              System.out.println(ar.length);  //4
	              
	            
	  System.out.println("------incresing order -------------");            
	              
	 for (int  i=ar.length-1; i>=0; i--)   
	 {
		 System.out.print(ar[i]+" "); 
		 
	
		 
	 }
	              
	   }
}
