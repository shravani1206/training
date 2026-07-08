package ORM;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="songs")
public class Song {
	@Id
private int songId;
	@Column(unique=true)
private String songTitle;
	@Column(nullable=false)
private String singer;
@ManyToOne
@JoinColumn(name="moveid")
private Movie movieid;
public Song() {
	// TODO Auto-generated constructor stub
}
public Song(int songId, String songTitle, String singer) {
	super();
	this.songId = songId;
	this.songTitle = songTitle;
	this.singer = singer;
	
}

public int getSongId() {
	return songId;
}
public void setSongId(int songId) {
	this.songId = songId;
}
public String getSongTitle() {
	return songTitle;
}
public void setSongTitle(String songTitle) {
	this.songTitle = songTitle;
}
public String getSinger() {
	return singer;
}
public void setSinger(String singer) {
	this.singer = singer;
}
public Movie getMovieid() {
	return movieid;
}
public void setMovieid(Movie movieid) {
	this.movieid = movieid;
}
@Override
public String toString() {
	return "Song [songId=" + songId + ", songTitle=" + songTitle + ", singer=" + singer +"]";
}

}
