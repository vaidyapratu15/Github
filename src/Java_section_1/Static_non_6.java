package Java_section_1;

public class Static_non_6 
{
    String name;
    int age;
    String surname;
    static String surname1;
    
    public void info()
    {
    	System.out.println(name+" " + age+" " + surname);
    	
    }
    
    public void staticinfo()
    {
    	System.out.println(name+" " + age+" " + surname1);
    }
    
    public static void main(String[] args) 
    {
		Static_non_6 a1 = new Static_non_6();
	    a1.name = "Pratibha ";    a1.age =29;   a1.surname = "VAIDYA" ;
	    
	    Static_non_6 a2 = new Static_non_6();
	    a2.name = "pratu ";    a2.age =25;   a2.surname = "VAIDya" ;
	    
	    Static_non_6 a3 = new Static_non_6();
	    a3.name = "pallu ";    a3.age =22;   a3.surname = "Vaidya" ;
	    
	    a1.info();   a2.info();  a3.info();    
	    
System.out.println("---------static----------------");
	    
    
	    Static_non_6 a4 = new Static_non_6();
	    a4.name = "Pratibha ";    a4.age =29;   
	    Static_non_6.surname1 = "VAIDYA" ;        //static 
	    
	   
	    
	    Static_non_6 a5 = new Static_non_6();
	    a5.name = "pallu ";    a5.age =22;  
	    static_non.surname1 = " Vaidya " ;  //------------------last  will taken to this above 2 also
	    
	    Static_non_6 a6 = new Static_non_6();
	    a6.name = "pratu ";    a6.age =25;   
	    Static_non_6.surname1 = " vaidyaa  " ;      //static 
	    
	    a4.staticinfo();  a5.staticinfo();  a6.staticinfo();
	    
	   
	    
	    
	}
    
    
    
    
}
