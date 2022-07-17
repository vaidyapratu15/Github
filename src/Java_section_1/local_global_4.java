package Java_section_1;

public class local_global_4
{      
	static int a = 10;
	int x =50;
	  
	public void glbal ()
	{
		int x1 = 55;
		System.out.println(x1);    //local   // 55
		System.out.println(this.x);   //global 50
		System.out.println(a);      //static   10
	}
	
	
	
	
	
	  public static void m1 ()
	  {
		  int i = 25;
		  System.out.println(a);
	//	  System.out.println(x);    not  possible global  in static ....
		  System.out.println(i);
		  
		//  System.out.println(this.x);  
		  local_global_4 a1 = new local_global_4();  
		   System.out.println(a1.x);               //local can access forthat object creat
	  }
	   
	  public void m2 ()
	  {
		  System.out.println(a);
		  System.out.println(x);     //possible here global
 	  }
	    
       public static void main(String[] args) 
       {
		  
		   m1();
		  local_global_4 a = new local_global_4();
		               a.m2();
    	               a.glbal();
    	   
    	   
    	   
    	   
    	   
    	   
	   }
	
	
	
	
	
	
	
	
}
