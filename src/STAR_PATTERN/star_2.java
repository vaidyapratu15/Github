package STAR_PATTERN;

public class star_2
{
        public static void main(String[] args) 
        {
			//*
        	//**
        	//***
        	
        	int star = 1;     //in 1st row 1*
        	for (int i =1; i<=3; i++ )
        	{
        		for (int j=1; j<=star; j++)
        		{
        			System.out.print("*"); 
        		}
        		System.out.println();
        		star++;
        	}
        	
System.out.println("                     ");        	
        	
        	//*****
            //****
            //***
            //**
            //*
        	
        	int star1 = 5;    //in 1st 5*is there
        	for (int x=1; x<=5; x++)           //5 rows
        	{
        		for (int z=1; z<=star1; z++)
        		{
        			System.out.print("*");
        		}
        		System.out.println();
        		star1--;
        	}
        	
		}
}
