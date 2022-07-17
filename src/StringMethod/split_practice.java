package StringMethod;

public class split_practice 
{
   public static void main(String[] args) 
   {
	   String s1 = "pratu,rani,queen,mishtie";
	   String [] ar = s1.split(",");
	   
	   for (int i=0; i<=ar.length-1; i++) {System.out.println(ar[i]);}
	   
	   
	   String s2 = "pratu$rani$queen$mishtie";
	   System.out.println(s2.replace("$", " "));
	  
	   
	   
	   
   }
}
