import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
public class MusicMain {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("mm:ss");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the  Music1 details: ");
		String Music1=scan.nextLine();
		System.out.println("Enter the  Music2 details: ");
		String Music2=scan.nextLine();
		String[] Musics1=Music1.split(",");
		String title=Musics1[0];
		String genre=Musics1[1];
		Date duration=sdf.parse(Musics1[2]);
		double rating=Double.parseDouble(Musics1[3]);
		Music mus =new Music(title, genre,( duration), rating);
			System.out.println("\nThe entered details for Music 1");
			System.out.println(mus);
		String[] Musics2=Music2.split(",");
			title=Musics2[0];
			 genre=Musics2[1];
			 duration=sdf.parse(Musics2[2]);
			 rating=Double.parseDouble(Musics2[3]);
			 Music mus1 =new Music(title, genre,duration, rating);
			System.out.println("\nThe entered details for Music 2");
		System.out.println(mus1);	
		System.out.println(mus.equals(mus1)?"1 and 2 are same":"1 and 2 are diff");
	}
}
		
