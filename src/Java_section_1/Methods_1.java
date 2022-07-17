package Java_section_1;

//1. veriables  2. data type  3.method (zero parameter ) ( with parameter)

public class Methods_1
{      
     public static void main(String[] args)
     {   //declaration
		 String sname ;  int roll; long r; double d; float f; char c;
		
		 //initialization
		 sname = "pratu";  roll = 1545145; r =531457983356987l; d=5555555588.25;  f=5544.55f; c ='a';
		 
    	 //usage
		 System.out.println( sname +" " + roll +" " + r + " " + d + " " + f +" " + c + " ");
		 
		 m1();
		 Methods_1 a1 = new Methods_1(); 
		         a1.m2();
		         a1.mul_div(500, 50);
		     
		  add_sub (100, 200) ; 
		  info ("pratiksha" , 15, "nov" , 7385423433l) ;
    	 
	 }
     
     
     public static void m1 () { System.out.println("running static method m1 (zero parameter) in same class");} 
     
     public void m2() { System.out.println("\"running non static  method m2 (without parameter) in same class"); }
     
     public static void add_sub (int a , int b)
     {   int sum = a+b;  int sub = b-a;  System.out.println("add= " +sum + " sub = " + sub);  }
     
     public void mul_div (int x , int y) 
     { int mul = x*y ;  int div = x/y;  System.out.println("multiplication =" + mul + " division = " +div);}
     
     public static void info (String s, int i ,String sn, long c )
     { System.out.println(" Name = " + s + "  Birthday date = " + i+sn+ "  Mob no =" + c ); }
     
      
     
}
