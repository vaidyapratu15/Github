package polymorphism;

public class overload1
{
	  //addition with 2 parameters
    public void info (String a , String b)
    {
    	System.out.println(a+b);
    }
    
    //addition with 3 parameters
    public void info  (String a , String b , String c)
    {
    	System.out.println(a+b+c);
    }
    
    public static void main(String[] args) 
    {
		overload1 a1 = new overload1();
		a1.info ("It" , "engg");    //binding at compile time which is depend on parameter
		a1.info ("Pratiksha " , "Laxman " , "Vaidya ");
	}
}
