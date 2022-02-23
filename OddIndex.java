import java.util.Scanner;
public class OddIndex {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num, Sum=0;
		System.out.println("Enter the elements in the Array");
		num=Integer.parseInt(scan.nextLine());
		int[] Arr=new int[num];
		for(int i=0;i<num;i++)
		{
			Arr[i]=scan.nextInt();
		}
		for(int i=0;i<num;i++)
		{
			if(i%2!=0)
			{
				Sum=Sum+Arr[i];
			}
			
				
			
		}
		System.out.println("the addition of the odd number is"+Sum);
	}

}
