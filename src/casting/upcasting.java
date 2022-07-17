package casting;

public class upcasting
{
   
	public static void main(String[] args)
	{
		//superclass object N = new subclass ();
		father a1 = new son ();
		       a1.car();
		       a1.money();
		       a1.home();
		       
		    //a1.bike ();    cant access here bz subclasss own property 
	}
}
