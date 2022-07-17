package Array;

public class singledia_intARRAY1 
{
        public static void main(String[] args) 
        {
			//Step 1 : Array declaration 
        	int [] ar = new int[5]; //int array object name = new int array size
        	
        	//Step 2 : Array initialization 
                 ar [0] = 50; 
                 ar [1] = 30;
                 ar [2] = 10;
                 ar [3] = 20;
                 ar [4] = 10; 
                 
           //Step 3 : usage 
           System.out.println(ar[3]);  //o/p = 20
           System.out.println(ar.length);  // size of array is = 5 
           System.out.println("---------print all deta from array------");
//Ascending           
           for (int i=0; i<=ar.length-1; i++)
        	           //i<=4   //size-1 (5-1=4)
           {
        	   System.out.println(ar[i]);
           }
//descending  
           System.out.println("-------reverse--------");
           for (int i=4; i>=0; i--)
           {
        	   System.out.println(ar[i]);
           }
        	
		}
}
