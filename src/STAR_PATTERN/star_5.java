package STAR_PATTERN;

public class star_5
{
           public static void main(String[] args)
           {
        	   //*********      //left side space we consider
      		   //  *******
      	       //    *****
      		   //      ***
        	   //        *
        	 int space = 0;    //in 1st row no space
        	 int star = 9;     //in 1st row 9*
        	   
        	 for(int i=1; i<=5; i++)     //5 rows
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
        		 space = space+2;   //space inc.
        		 star = star-2;     //star dec.
        		 
        	 }
        	 
       System.out.println(    );
        
        //      *
        //    ***
        //  *****
        //*******
        
               int space1 = 6;   //in 1st row 6 space
               int star1 = 1;     // in 1st 1*
               
               for (int q=1; q<=4; q++)  //4 rows 
               {
            	   for (int x=1; x<=space1; x++)
            	   {
            		   System.out.print(" ");
            	   }
            	   for (int z=1; z<=star1; z++)
            	   {
            		   System.out.print("*");
            	   }
            	   System.out.println();
            	   space1 = space1-2;
            	   star1 = star1+2;
               }  
               
         }
        	   
}
