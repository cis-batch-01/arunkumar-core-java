package userexception1;

public class User {
	private String name;
	private String description;
	public String  language;
	public double rating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public User(String name, String description, String language, double rating) {
		super();
		this.name = name;
		this.description = description;
		this.language = language;
		this.rating = rating;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", description=" + description + ", language=" + language + ", rating=" + rating
				+ "]";
	}

}
