package workout;

public class Topics {
 public Integer id;
 public String Name;
 public String Chapter;
 public String description;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getChapter() {
	return Chapter;
}
public void setChapter(String chapter) {
	Chapter = chapter;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Topics(Integer id, String name, String chapter, String description) {
	super();
	this.id = id;
	Name = name;
	Chapter = chapter;
	this.description = description;
}
public Topics() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Topics [id=" + id + ", Name=" + Name + ", Chapter=" + Chapter + ", description=" + description + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Chapter == null) ? 0 : Chapter.hashCode());
	result = prime * result + ((Name == null) ? 0 : Name.hashCode());
	result = prime * result + ((description == null) ? 0 : description.hashCode());
	result = prime * result + ((id == null) ? 0 : id.hashCode());
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
	Topics other = (Topics) obj;
	if (Chapter == null) {
		if (other.Chapter != null)
			return false;
	} else if (!Chapter.equals(other.Chapter))
		return false;
	if (Name == null) {
		if (other.Name != null)
			return false;
	} else if (!Name.equals(other.Name))
		return false;
	if (description == null) {
		if (other.description != null)
			return false;
	} else if (!description.equals(other.description))
		return false;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}
public static Topics createCast(String data) {
	String[] splitted=data.split(",");
	Topics topics=new Topics(Integer.parseInt(splitted[0]), splitted[1], splitted[2], splitted[3]);
	return topics;
}

 
}
