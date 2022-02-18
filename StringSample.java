import java.util.Scanner;

public class StringSample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string to check wheather it is plaindrome or not");
		String data = scan.nextLine();
		StringBuilder sb = new StringBuilder(data);
		int length = data.length();
				if (data.equals(sb.reverse().toString())) {

				System.out.println("entered string is Plaindrome");

			} else {
				System.out.println("entered string is not a Plaindrome");
			}
	}

}
