import java.util.Scanner;
public class Fourdigit {
	public static  void main(String args[]) {
		int a,b,c,d;
		System.out.println("enter four number");
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		c=scan.nextInt();
		d=scan.nextInt();
		if( (a==b)&&(a==c)&&(a==d))
			{
				System.out.println("all the values are equal");
	
	}
			else if((a>b)&&(a>c)&&(a>d))
				System.out.println("a is greater");
			else if((b>c)&&(b>d))
				System.out.println("b  is greater");
			else if((c>d))
				System.out.println("c is greater");
			else 
				System.out.println("d  is greater");
		

	}
}
