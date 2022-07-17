package Array;

public class multi_dia_array25 
{
    public static void main(String[] args)
    {
		// 0 1 2 
    	// 0 10 20 30 
    	// 1 40 50 60
    	
    	//step 1 : Array declaration
    	int [] [] ar = new int[2][3];  // [ ] --array of row //  [] ---array of column 
    	
    	//step 2 : Array initialization
    	ar [0] [0] = 10;   //1st for row 2nd for clm
    	ar [0] [1] = 20; 
    	ar [0] [2] = 30; 
    	ar [1] [0] = 40; 
    	ar [1] [1] = 50; 
    	ar [1] [2] = 60; 
    	
    	//step 3 : usage
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
