package ORM;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.mmcoe.dao.TeamPlayerDao;
import com.mmcoe.dao.cinamamoviedao;
import com.mmcoe.entity.Cinema;
import com.mmcoe.entity.Movie;
import com.mmcoe.entity.Song;

public class testmovie {
public static cinamamoviedao dao;
@BeforeAll
public static void init() {
	dao=new cinamamoviedao();
}
//@Test
//public void testsave()
//{
//	Song m=new Song(3,"rooh","kishore kumar");
//	assertNotNull(dao.save(m));
//}
//@Test
//public void testaddstom()
//{
//	Song m=new Song(7,"rasleela","avijit");
//	assertNotNull(dao.addsongtomovie(m,2));
//	
//}
//@Test
//public void testaddmtoc()
//{
//	assertTrue(dao.addmovietocinema(2, 3));
//}
//@Test
//public void testfindmovie()
//{
//	assertNotNull(dao.findmovie(1));
//}
//@Test
//public void testfindcinema()
//{
//	assertNotNull(dao.findcinema(1));
//}
//@Test
//public void testfindbytitle()
//{
//	List<Cinema> l=dao.findbytitle("abc");
//	assertNotNull(l);
//	l.forEach(System.out::println);
//}
//@Test
//public void testbycity()
//{
//	List<Movie> l=dao.findMoviebycity("pune");
//	assertNotNull(l);
//	l.forEach(System.out::println);
//}
//@Test
//public void testsinger()
//{
//	List<Song> l=dao.findsongsbysinger("arijit singh");
//	assertNotNull(l);
//	l.forEach(System.out::println);
//}
@Test
public void testfindmoviefromsong()
{
	Movie m=dao.findmoviefromsong("paaro");
	assertNotNull(m);
	System.out.println(m);
}
@Test
public void testfindsongfrommovie()
{
	List<Song> l=dao.findsongbymovie("abc");
	assertNotNull(l);
	l.forEach(System.out::println);
}
}
