package StringMethod;

public class StringMethod2 
{  public static void main(String[] args)
{
//1. length ( )
	   String s1 = "pratiksha";         System.out.println(s1.length());       //8

//2. toUpperCase ( )	       	   
	                                   System.out.println(s1.toUpperCase());     

//3. toLowerCase ( )  	    	 
	   String s2 = "ABCD";             System.out.println(s2.toLowerCase());     // abcd
	 
//4. equals ( ) 	    	 
	   String s3 = "abcd";             System.out.println(s2.equals(s3));      //false (bz case diff , contain same)
	                
//5. equalsIgnoreCase ( )	    	 
	                                   System.out.println(s2.equalsIgnoreCase(s3)); //true (only check same contain )
	 
//6. contains (" " )
	    String s4 = "its me prtz" ;    System.out.println(s4.contains("prtz"));   //true                       
	                                   System.out.println(s4.contains("PRtz"));   //false  
	 
//7. isEmpty( )
	    String s5 = "";                System.out.println(s5.isEmpty()); //true     
	                              //   System.out.println(s5.isBlank()); //true    only check is there any char
	                                   System.out.println(s4.isEmpty()); //false
	 
//8. charAt ( int index )	    	 
System.out.println(s1.charAt(3));      System.out.println(s1.charAt(7));    
	                                   
//9. indexOf (' ') 
      String s6 = "abcabab";         System.out.println(s6.indexOf('b'));  // 1
                
//10. lastIndexOf (' ' ) 	    	 
	                                  System.out.println(s6.lastIndexOf('a'));  
	 
//11. startsWith (" ")
	    String s7 = "pratiksha";      System.out.println(s7.startsWith("pr"));     //true                      
	 
//12. endwith (" ")	    	 
	                                  System.out.println(s7.endsWith("ha"));    //true
	                                  System.out.println(s7.endsWith("ks"));   // false
	 

//13.1.substring (begin index)
	                                  System.out.println(s4.substring(4)); //from 4th to end // me prtz
//13. 2.substring(int begin , endindex)	    	                                  
	                                  System.out.println(s4.substring(3, 10));   //@3 - space @10- take befor 9- t // me prt
	                                  
//14. concat ( )
	                                  System.out.println(s2+s3);  //ABCD + abcd = ABCDabcd
	                                  System.out.println(s2.concat(s3));  // ABCDabcd
	                                  System.out.println(s3.concat(s2));  // abcdABCD
	                                  
//15.replace ( )	    	                                  
	    String s8 = "queen ranii";  System.out.println(s8.replace("ranii", "pratu")); 

	                                  
	                                  
//16. split 
	                                  
	                                  
	                                  
	 
	 
}
      





}
