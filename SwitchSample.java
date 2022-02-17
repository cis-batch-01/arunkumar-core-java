import java.util.Scanner;
public class SwitchSample {
	
	public static void main(String args[]) {
		
	
	// TODO Auto-generated constructor stub
	System.out.print("Enter the day you need");
	Scanner scan=new Scanner(System.in);
		int day=scan.nextInt();
	switch (day)
	{
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
		System.out.println("print");
			break;
	}


	}
	
		
	}


