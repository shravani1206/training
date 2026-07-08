package ORM;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mmcoe.entity.Cinema;
import com.mmcoe.entity.Department;
import com.mmcoe.entity.Employee;
import com.mmcoe.entity.Movie;
import com.mmcoe.entity.Song;

public class cinamamoviedao {
private EntityManagerFactory emf;
public cinamamoviedao(){
	emf=Persistence.createEntityManagerFactory("MyJPA");
}
public Object save(Object m)
{
	EntityManager mgr=emf.createEntityManager();
	EntityTransaction txn=mgr.getTransaction();
	txn.begin();
	mgr.persist(m);
	txn.commit();
	return m;
}
public Song addsongtomovie(Song e,int movieid)
{
	EntityManager mgr=emf.createEntityManager();
	EntityTransaction txn=mgr.getTransaction();
	txn.begin();
	Movie d=mgr.find(Movie.class, movieid);
	System.out.println(d);
	e.setMovieid(d);
	mgr.persist(e);
	txn.commit();
	return e;
}
public boolean addmovietocinema(int mid,int cid)
{
	EntityManager mgr=emf.createEntityManager();
	EntityTransaction txn=mgr.getTransaction();
	txn.begin();
	Movie m=mgr.find(Movie.class, mid);
	Cinema c=mgr.find(Cinema.class, cid);
	c.getMovies().add(m);
	txn.commit();
	return true;
}
public Movie findmovie(int mid)
{
	EntityManager mgr=emf.createEntityManager();
	
	return mgr.find(Movie.class, mid);
	
}
public Cinema findcinema(int cid) {
	// TODO Auto-generated method stub
	EntityManager mgr=emf.createEntityManager();
	return mgr.find(Cinema.class,cid);
}
public List<Cinema> findbytitle(String moviename)
{
	EntityManager mgr=emf.createEntityManager();
	String hql= "SELECT c FROM Cinema c JOIN c.movies m WHERE m.title = :moviename";
	Query q=mgr.createQuery(hql);
	q.setParameter("moviename", moviename);
	return q.getResultList();
}
public List<Movie> findbygener(String g)
{
	EntityManager mgr=emf.createEntityManager();
	String hql= "SELECT m FROM Movie m WHERE m.genre = :g";
	Query q=mgr.createQuery(hql);
	q.setParameter("g", g);
	return q.getResultList();
}
public List<Cinema> findbycity(String city)
{
	EntityManager mgr=emf.createEntityManager();
	String hql= "SELECT c FROM Cinema c WHERE c.location = :city";
	Query q=mgr.createQuery(hql);
	q.setParameter("city", city);
	return q.getResultList();
}
public List<Movie> findMoviebycity(String city)
{
	EntityManager mgr=emf.createEntityManager();
	String hql= "SELECT m FROM Movie m join m.cinemas c WHERE c.location = :city";
	Query q=mgr.createQuery(hql);
	q.setParameter("city", city);
	return q.getResultList();
}
public List<Song> findsongsbysinger(String singer)
{
	EntityManager mgr=emf.createEntityManager();
	String hql="From Song where singer=:singer";
	Query q=mgr.createQuery(hql);
	q.setParameter("singer", singer);
	return q.getResultList();
}
public Movie findmoviefromsong(String song)
{
	EntityManager mgr=emf.createEntityManager();
	String hql = "SELECT m FROM Movie m JOIN m.songs s WHERE s.songTitle = :song";
	Query q=mgr.createQuery(hql);
	q.setParameter("song", song);
	Movie movie = (Movie) q.getSingleResult();
	return movie;
}
public List<Song> findsongbymovie(String movietitle)
{
	EntityManager mgr=emf.createEntityManager();
	String hql="SELECT s FROM Song s JOIN s.movieid m WHERE m.title = :movietitle";
	Query q=mgr.createQuery(hql);
	q.setParameter("movietitle", movietitle);
	return q.getResultList();
}
}
