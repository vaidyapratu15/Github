package StringMethod;

public class Split_Stringmethod28_4 
{      
	   public static void main(String[] args) 
	   {
	              String s1 = "my name is pratiksha";
	              String [] ar = s1.split(" ");   //my[0] name[1] is[2] pratiksha[3]   //length = 4
	   
	              System.out.println(ar[3]);     // pratiksha
	              System.out.println(ar.length);  //4
	              
	  System.out.println("----print all data from String array----");            
	  System.out.println("------incresing order -------------");            
	              
	 for (int i=0; i<=ar.length-1; i++)   
	 {
		 System.out.println(ar[i]);
	 }
	              
	 System.out.println("-----  reverse order -------------");                
	              
	  for (int j=ar.length-1; j>=0; j--)            
	  {
		  System.out.println(ar[j]);
	  }
	              
	   
	 System.out.println("-----in one lint print----"); 
	 for (int i=0; i<=ar.length-1; i++)  {System.out.print(ar[i]+" "); }
	 
	 System.out.println();
	 
	 for (int i=ar.length-1; i>=0; i--)  {System.out.print(ar[i]+" "); }
	   }
	    
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

