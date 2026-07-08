package ORM;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class Movie {
	@Id
	@Column(name="mid")
private int movieId;
private String title;
private String genre;
@ManyToMany
@JoinTable(name="showtime",joinColumns = {@JoinColumn(name="mid")},inverseJoinColumns = {@JoinColumn(name="cid")})
private List<Cinema> cinemas=new ArrayList<Cinema>();
@OneToMany(mappedBy = "movieid",fetch = FetchType.EAGER)
private List<Song> songs=new ArrayList<Song>();
public Movie() {
	// TODO Auto-generated constructor stub
}
public Movie(int movieId, String title, String genre) {
	super();
	this.movieId = movieId;
	this.title = title;
	this.genre = genre;
}

public int getMovieId() {
	return movieId;
}
public void setMovieId(int movieId) {
	this.movieId = movieId;
}
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
public List<Cinema> getCinemas() {
	return cinemas;
}
public void setCinemas(List<Cinema> cinemas) {
	this.cinemas = cinemas;
}
@Override
public String toString() {
	return "Movie [movieId=" + movieId + ", title=" + title + ", genre=" + genre + "]";
}
}
