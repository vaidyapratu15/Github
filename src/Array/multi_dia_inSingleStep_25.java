package Array;

public class multi_dia_inSingleStep_25 
{
    public static void main(String[] args) 
    {
    	// 0 1 2 
    	// 0 10 20 30 
    	// 1 40 50 60
    	
    	//step 1:  Array declaration and initialization (in 1 step )
    	int [][] ar = { {10,20,30} , {40,50,60} };    //2 curly brackets for 2 rows @ 10,20,30 --> 3 coulmn
    	
    	//Step 2 : usage
    	System.out.println(ar [1] [1]);  //o/p 50
    	System.out.println(ar.length);   //=2 only print row ...not shown size of column 
    	
    	System.out.println("-------print all data from array----------");
    	
    	for (int i=0; i<=1; i++)  //outer for loop ----> for rows / end no size-1 /2-1=1
    	{
    		for (int j=0; j<=2; j++)  //inner for loop ----> for column / end no size-1 /3-1=2
    		{
    			System.out.print(ar [i] [j] + " ");
    		}
    		System.out.println();
    	}
    	
	
	}
}
