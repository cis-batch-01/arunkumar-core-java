import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class Music {
	
	private String title;
	private String genre ;
	private java.util.Date duration  ;
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
	public Music(String title, String genre, java.util.Date duration, double rating) {
		super();
		this.title = title;
		this.genre = genre;
		this.duration = duration;
		this.rating = rating;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("mm:ss");
		return "\n Title:" + title + " \nGenre:" + genre + " \nDuration:" +sdf.format(duration)  + " \nRating=" + rating + "";
	}
	public Music() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Music other = (Music) obj;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	
	}



	