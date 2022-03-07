import java.util.Scanner;
public class MovieMain {
public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the  movie1 details: ");
		String movie1=scan.nextLine();
		System.out.println("Enter the  movie2 details: ");
		String movie2=scan.nextLine();
		String[] movies1=movie1.split(",");
		String Name=movies1[0];
		double boxoffice=Double.parseDouble(movies1[1]);
		double budget=Double.parseDouble(movies1[2]);
		double rating=Double.parseDouble(movies1[3]);
		Movie mov =new Movie(Name, boxoffice, budget, rating);
			System.out.println("the entered details for movie 1");
			System.out.println(mov);
		String[] movies2=movie2.split(",");
		Name=movies2[0];
		boxoffice=Double.parseDouble(movies2[1]);
		 budget=Double.parseDouble(movies2[2]);
		rating=Double.parseDouble(movies2[3]);
		Movie mov1 =new Movie(Name, boxoffice, budget, rating);
		System.out.println("the entered details for movie 2");
	System.out.println(mov1);	
	System.out.println(mov.equals(mov1)?"1 and 2 are same":"1 and 2 are diff");
	} 
}
