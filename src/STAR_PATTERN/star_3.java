package STAR_PATTERN;

public class star_3
{
        public static void main(String[] args)
        {
			  //*
        	  //***
        	  //*****
        	  //******
        	int star = 1; //in 1st row 1*
        	for (int i=1; i<=4; i++)    //4 rows
        	{
        		for (int j=1; j<=star; j++)
        		{
        			System.out.print("*");
        		}
        		System.out.println();
        		star= star+2;
        	}
        	
  System.out.println(   );      	
               //*********
               //*******
               //*****
               //***
               //*
        	
            int star1 =9;
        	for (int a=1; a<=5; a++)
        	{
        		for(int z=1; z<=star1; z++)
        		{
        			System.out.print("*");
        		}
        		System.out.println();
        		star1= star1-2;
        	}
        	
        	
        	
        	
        	
        	
        	
        	
		}
}
