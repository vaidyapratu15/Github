package STAR_PATTERN;

public class star_4 
{ 
	   public static void main(String[] args)
	   {
		//left side space we conside in star pattern
		   //   *      //space 3 from left
		   //  **
		   // ***
		   //****    
		   
		   int space =3;     // in 1st row 3 space 
		   int star = 1;     //in 1st row 1*
		   
		   for (int i=1; i<=4; i++)    //no of rows =3
		   {
			   for (int j=1; j<=space; j++)
			   {
				   System.out.print(" ");
			   }
			   for (int j=1; j<=star; j++)
			   {
				   System.out.print("*");
			   }
			   System.out.println();
			   space--;    //space is decressing 
			   star++;     //star inc.
		   }
		   
		 System.out.println();  
		 //****
		 // ***
		 //  **
		 //   *
		   
		   int space1 =0;   //no space in 1st row
		   int star1 = 4;   //4 star in 1st row 
		   
		   for (int q=1; q<=4; q++)  //4 rows are there
		   {
			  for (int w=1; w<=space1; w++) 
			  {
				  System.out.print(" ");
			  }
			  for (int w=1; w<=star1; w++)
			  {
				  System.out.print("*");
			  }
			  System.out.println();
			  space1++;    //space inc.
			  star1--;     //star is dec.
		   }
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	   }
       


}
