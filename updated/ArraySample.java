	import java.util.Scanner;
public class ArraySample {
	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the no of  element in array");
	Integer num=Integer.parseInt(scan.nextLine());
	String[] str=new String[num];
	System.out.println("enter the element in array");
	for(int i=0;i<num;i++)
	{

		str[i]=scan.nextLine();
	}
		System.out.println("enter a string to match");
		String name=scan.nextLine();
		int resIndex=0;
		for(int i=0;i<num;i++) {
			if (name.equals(str[i]))
			{
			resIndex=i;
			break;
			}
			
		}
		System.out.println("The Searched string is in the index "+resIndex);

	}

}
