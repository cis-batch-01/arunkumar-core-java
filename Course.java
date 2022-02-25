package comprator;

public class Course implements Comparable<Course> {

	private String title;
	private String description;
	private int duration;
	private double rating;
	private String skilLevel;
	private String language;
	private boolean captions;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getSkilLevel() {
		return skilLevel;
	}
	public void setSkilLevel(String skilLevel) {
		this.skilLevel = skilLevel;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public boolean isCaptions() {
		return captions;
	}
	public void setCaptions(boolean captions) {
		this.captions = captions;
	}
	public Course(String title, String description, int duration, double rating, String skilLevel, String language,
			boolean captions) {
		super();
		this.title = title;
		this.description = description;
		this.duration = duration;
		this.rating = rating;
		this.skilLevel = skilLevel;
		this.language = language;
		this.captions = captions;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "[title=" + title + ", \nDescription=" + description + ", \nDuration=" + duration + ", \nRating="
				+ rating + ", \nSkilLevel=" + skilLevel + ", \nLanguage=" + language + ", \nCaptions=" + captions + "]";
	}
	public int compareTo(Course o) {
		
		return this.title.compareTo(o.getTitle());
	}
	
	
	
	
	
	
	}
	
	
	


