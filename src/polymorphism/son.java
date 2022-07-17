package polymorphism;

public class son extends father
{  
	   //sub class
      
	 public void car () //override
     {
    	 System.out.println("car : kia seltos");
     }
     
     public void money ()   //override
     {
    	 System.out.println("money : 15L");
     }
     
     public void home () //no any change in propertys
     {
    	 System.out.println("Home : 2BHK");
     }
}
