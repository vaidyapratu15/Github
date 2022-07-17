package Array;

public class multi_practice 
{
  public static void main(String[] args) 
  {
	       // 0 10 20 30 9
           // 1 40 50 60 99
	       // 2 70 80 90 999
	  
	 int [][]a = new int[3][4];   //3--row , 4--column
	 
	         a [0][0] = 10;  
	         a [0][1] = 20;  
	         a [0][2] = 30; 
	         a [0][3] = 9;  
	         
	         a [1][0] = 40;  
	         a [1][1] = 50;  
	         a [1][2] = 60; 
	         a [1][3] = 99;  
	         
	         a [2][0] = 70;  
	         a [2][1] = 80;  
	         a [2][2] = 90; 
	         a [2][3] = 999;  
	         
	 System.out.println("-------print all data from array-----");    
	 for (int i=0; i<=2; i++)     //outer for row (3-1=2)
	 {
		 for (int j=0; j<=3; j++)  //inner --for column (4-1=3)
		 {
			 System.out.print(a[i][j]+ " ");
		 }
		 System.out.println();
	 }
	         
	         
	         
  }
	
}
