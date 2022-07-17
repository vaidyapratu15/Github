package casting;

public class son extends father 
{
     public void bike ()
     {
    	 System.out.println("bike : F2 v3 ");
     }
     
     //father property accessing 
     public void car () 
     {
    	 System.out.println("car : Kia seltos");  //override /update bmw changed
     }
     
     public void money () 
     {
    	 System.out.println("money : 2L");   //override /update 5L changed 
     }
     
     public void home () 
     {
    	 System.out.println("Home : 3BHK");  //override /update 3bhk
     }
}
