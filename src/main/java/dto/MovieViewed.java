package dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class MovieViewed {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name = "";
	private int genre;
	private int category;
	private String comment = "";
	
	public MovieViewed(){}
	
	public MovieViewed(int id, String name, int genre, int category, String comment) {
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.category = category;
		this.comment = comment;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGenre() {
		return genre;
	}

	public void setGenre(int genre) {
		this.genre = genre;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
