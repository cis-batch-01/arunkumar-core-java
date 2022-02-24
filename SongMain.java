import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SongMain {
public static void main(String[] args) throws NumberFormatException, ParseException {
	Scanner scan=new Scanner(System.in);
	List<Music>songList=new ArrayList<Music>();
	int choice='n';
	
		
		for(int i=0;i<=3;i++)
		{System.out.println("Enter the Song Name:");
		System.out.println("Enter Song Details :");
		String data =scan.nextLine();
		Music mus=Music.createMusic(data);
		songList.add(mus);
	
}
	System.out.println(songList);
	Collections.sort(songList);
	System.out.println(songList);
}
}
