package Java_section_1;
 
         // 1. if   2. if else   3.if else if    4.nested if    5.switch
public class Control_statements_2 
{
    public static void main(String[] args) 
    {
		int i =10;
		if (i >=10)
		{
			System.out.println("pass");
		}
    	
    	int j = 20;
    	if (j>=30) {System.out.println("pass"); }
    	else 
    	{
    		System.out.println("fail");
    	}
    	
    	int a = 73;
    	if (a<=50)  { System.out.println("pass"); }
    	else if  (a<=55)  { System.out.println("2st class"); }
    	else if (a<=61)  { System.out.println(" 1st class");  }
    	else if (a>=61)  { System.out.println("distinction");  }
    	else { System.out.println("fail"); }
    	

        int z = 25;
        if (z >=18) 
        {
        	int w = 50;
        	if (w>=50)
        	{ 
        		System.out.println("eligibal for blood donation"); 
            }
        	System.out.println(" eligible for 1st stage");
        }
        
        switch (2)
        {
        case 1 : System.out.println(" case 1");
        break;
        case 2 : System.out.println(" case 2");
        break;
        default : System.out.println(" invalid");
        }
    	
	}
}
