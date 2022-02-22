import java.util.Scanner;

public class AdditionArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("enter the elements in Array");
		num = Integer.parseInt(scan.nextLine());
		int[] poe = new int[num];
		for (int i = 0; i < num; i++) {
			poe[i] = Integer.parseInt(scan.nextLine());
		}
		int mul=1;
		for (int i = 0; i < num; i++) {
			mul = mul * poe[i];
		}
		System.out.println("The entered number product System is:" + mul);
	}
}
