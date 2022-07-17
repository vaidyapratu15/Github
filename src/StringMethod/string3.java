package StringMethod;

public class string3
{    
	 public static void main(String[] args)
	    {
			          String s1 = "pratibha";
			          String s2 = "RANI , QUEEN";
			          String s3 = "rani , queen";
			          String s4 = "";
			          String s5 = "ababcad";
			       			 
			 
			     System.out.println(s1.length());              
			    
			    
			     System.out.println(s1.toUpperCase());         
			     
			     System.out.println(s2.toLowerCase());        
			     
			     System.out.println(s2.equals(s3));          
			     
			     System.out.println(s2.equalsIgnoreCase(s3));  
			     
			     System.out.println(s3.contains("rani"));      
			     
			     System.out.println(s4.isEmpty());           
			     System.out.println(s3.isEmpty());             
			     
			     System.out.println(s1.charAt(4));   System.out.println(s1.charAt(7)); 
			     
			     System.out.println(s5.indexOf('b'));  System.out.println(s5.indexOf('a')); 
			     
			     System.out.println(s5.lastIndexOf('b')); System.out.println(s5.lastIndexOf('a')); 
			     
			     System.out.println(s1.startsWith("pr"));  
			     System.out.println(s1.startsWith("PR"));  
			     
			     System.out.println(s1.endsWith("ksha"));  System.out.println(s1.endsWith("ha"));  
			     
			    		     
		}
	

}
