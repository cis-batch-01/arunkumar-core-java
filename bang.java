import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Date;

public class Music implements Comparable<Music> {
	private String title;
	private String genre ;
	private Date duration  ;
	private double rating;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public java.util.Date getDuration() {
		return duration;
	}
	public void setDuration(java.util.Date duration) {
		this.duration = duration;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "title=" + title + ", genre=" + genre + ", duration=" + duration + ", rating=" + rating + "";
	}
	public Music() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	public int compareTo(Music o1) {
		// TODO Auto-generated method stub
		return this.getTitle().compareTo(o1.getTitle());
	}
	public static Music createMusic(String data) throws NumberFormatException, ParseException
	{
		String[] userData=data.split(",");
		SimpleDateFormat sdf=new SimpleDateFormat("mm:ss");
	Music mus=new Music(userData[0],userData[1],sdf.parse(userData[2]) , Double.parseDouble(userData[3]));
		return mus;
	}
	public Music(String title, String genre, Date duration, double rating) {
		super();
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.rating = rating;
	}
}
