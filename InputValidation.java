import java.util.Scanner;
public class InputValidation {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int num;		
	do
	{
		System.out.println("Enter the Value");
		 num=Integer.parseInt(scan.nextLine());
	if(num<=0)
		System.out.println("Invlid Input");
	}
	while(num<=0);
	//System.out.println("enter the number again ");
	
	
}
}
