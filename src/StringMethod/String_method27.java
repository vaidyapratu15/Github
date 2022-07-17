package StringMethod;

public class String_method27
{
    public static void main(String[] args)
    {
		          String s1 = "pratiksha";
		          String s2 = "RANI , QUEEN";
		          String s3 = "rani , queen";
		          String s4 = "";
		          String s5 = "ababcad";
		          String s6 = "mistie 158 ";
		          String s7 = "-Rani  queen-" ;  //01234 56 789101112   --total length //13(start from zero)
		 
		 
		     System.out.println(s1.length());              //9
		     System.out.println(s7.length());              //13
		    
		     System.out.println(s1.toUpperCase());         //PRATIKSHA
		     
		     System.out.println(s2.toLowerCase());         //rani , queen
		     
		     System.out.println(s2.equals(s3));            //false (same contain bt diff case therefore ans false)
		     
		     System.out.println(s2.equalsIgnoreCase(s3));  //True (here only check is contain is same ) 
		     
		     System.out.println(s3.contains("rani"));      //True bz rani is present in s3
		     
		     System.out.println(s4.isEmpty());             //True 
		     System.out.println(s3.isEmpty());             //false 
		     
		     System.out.println(s1.charAt(4));   System.out.println(s1.charAt(7)); //i  // h   (start from zero)
		     
		     System.out.println(s5.indexOf('b'));  System.out.println(s5.indexOf('a')); //1 //0 (start from zero and from left)
		     
		     System.out.println(s5.lastIndexOf('b')); System.out.println(s5.lastIndexOf('a')); //3,5 (from last)
		     
		     System.out.println(s1.startsWith("pr"));  //true 
		     System.out.println(s1.startsWith("PR"));  //false (used cap -->case is sensitive)
		     
		     System.out.println(s1.endsWith("ksha"));  System.out.println(s1.endsWith("ha"));  //true
		     
		     System.out.println(s2+s3);  //RANI , QUEENrani , queen
		     System.out.println(s2.concat(s3));    //RANI , QUEENrani , queen
		     System.out.println(s3.concat(s2));    //rani , queenRANI , QUEEN
		     
		     System.out.println(s6.replace("mistie", "pratiksha"));  //old-mistie158  //new- pratiksha158
		     
		     System.out.println(s6.substring(3));  //
		     System.out.println(s6.substring(1, 13));  //at zero = -   at at 13 = -  (b/w 1-12) print
		     
		     
		     
		     
		     
		     
		     
		     
		     
		     
	}
}
