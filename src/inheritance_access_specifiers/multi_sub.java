package inheritance_access_specifiers;

public class multi_sub implements multi1,multi2
{
    public void m1() 
    {
		System.out.println("providing def for ic methods1");
	}
    
    public void m2()
    {
    	System.out.println("providing def for ic method2");
    }
}
