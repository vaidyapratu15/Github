package Array;

import java.util.Arrays;

public class All_Original_Sorting
{ public static void main(String[] args) {
 
	int [] ia = { 50, 100, 25, 5};
	String [] sa = {"Pratiksha" , "Laxman", "Vaidya" }; 
	
	System.out.println("------original int ascening-----------");
	for (int i=0; i<=ia.length-1; i++)          { System.out.println(ia[i]); }
	System.out.println("------original int descening-----------");
	for (int i=ia.length-1; i>=0; i--)          { System.out.println(ia[i]); }
	
	System.out.println("------original String ascening-----------");
	for (int i=0; i<=sa.length-1; i++)          { System.out.println(sa[i]); }
	System.out.println("------original String descening-----------");
	for (int i=sa.length-1; i>=0; i--)          { System.out.println(sa[i]); }
System.out.println("------------------------------------Sorting(permanent change)--------------------------");	
	
	Arrays.sort(ia);                                                       
	
	System.out.println("------Sorting int ascening-----------");
	for (int i=0; i<=ia.length-1; i++)          { System.out.println(ia[i]); }
	System.out.println("------Sorting int descening-----------");
	for (int i=ia.length-1; i>=0; i--)          { System.out.println(ia[i]); }
	
	Arrays.sort(sa);
	
	System.out.println("------Sorting String ascening-----------");
	for (int i=0; i<=sa.length-1; i++)          { System.out.println(sa[i]); }
	System.out.println("------sorting String descening-----------");
	for (int i=sa.length-1; i>=0; i--)          { System.out.println(sa[i]); }
}

}
