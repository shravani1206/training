package ORM;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="cinemas")
public class Cinema {
	@Id
	@Column(name="cid")
private int cinemaId;
	@Column(name="cname")
private String cinemaname;
private String location;
@ManyToMany
@JoinTable(name="showtime" ,joinColumns = {@JoinColumn(name="cid")},inverseJoinColumns = {@JoinColumn(name="mid")})
private List<Movie> movies= new ArrayList<Movie>();
public Cinema() {
	// TODO Auto-generated constructor stub
}
public Cinema(int cinemaId, String name, String location) {
	super();
	this.cinemaId = cinemaId;
	this.cinemaname = name;
	this.location = location;
}

public int getCinemaId() {
	return cinemaId;
}
public void setCinemaId(int cinemaId) {
	this.cinemaId = cinemaId;
}
public String getCinemaname() {
	return cinemaname;
}
public void setCinemaname(String cinemaname) {
	this.cinemaname = cinemaname;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public List<Movie> getMovies() {
	return movies;
}
public void setMovies(List<Movie> movies) {
	this.movies = movies;
}
@Override
public String toString() {
	return "Cinema [cinemaId=" + cinemaId + ", cinemaname=" + cinemaname + ", location=" + location + "]";
}

}
