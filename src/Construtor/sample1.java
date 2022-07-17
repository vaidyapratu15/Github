package Construtor;

public class sample1
{
       int num1;
       int num2;
       String a;
       sample1(String b) { a=b;  }
       
       public void m ()
       {
    	   System.out.println(a);
       }
       sample1(int a , int b)
       {
    	   num1=a;
    	   num2=b;
       }
       
       public void m1()
       {
    	   System.out.println(num1+num2);
    	   System.out.println(num1-num2);
       }
       
      public static void main(String[] args)
      {
		 sample1 xx = new sample1(100, 2);
		 xx.m1();
		 
		 sample1 xxx = new sample1("Pratu");
		 xxx.m();
		 
	}
}
