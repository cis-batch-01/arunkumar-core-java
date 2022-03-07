import java.util.Scanner;

public class AdditionArray1 {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int i,num,sum=0;
		System.out.println("Please enter the Array size :") ;
 		num = scan.nextInt();
		int[] a = new int[n];
 
    		System.out.println("Enter the elements") ;
    		for(i=0;i<n;i++)
    		{
        		a[i] = scan.nextInt();
    		}
    		for(i=0;i<n;i++)
    		{
        		sum=sum+a[i];
    		}
    	
		System.out.println("Sum of "+num+" elements in an array = "+sum);
	}
}
