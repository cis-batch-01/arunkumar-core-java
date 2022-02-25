package collection;

import java.util.Scanner;
import java.util.Set;

public class StudentName {
	public static void main(String[] args) {
		Set<String>StudentNameset=new Tree();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the no of Students");
		int num=Integer.parseInt(scan.nextLine());
		for(i=0;i<num;i++)
		{System.out.println("enter the Students Name");
		String name=scan.nextLine();
		StudentNameset.add(name);
				}
		System.out.println("the students names are");
		System.out.println(StudentNameset);
	}

}
