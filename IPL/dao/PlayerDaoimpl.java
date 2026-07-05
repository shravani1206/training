package IPL.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import IPL.pojo.Player;

public class PlayerDaoimpl implements PlayerDao{

	@Override
	public Player searchPlayer(String name) {
		// TODO Auto-generated method stub
		String sql="select * from players where name=?";
		try 
			(Connection conn=JDBC.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);)
			{
			ps.setString(1,name);
			ResultSet re=ps.executeQuery();
			if(re.next())
			{
				return new Player(re.getInt(3),re.getString(2),re.getString(1),re.getString(4));
			}
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	
		return null;
	}

	@Override
	public boolean deletePlayer(String name) {
		// TODO Auto-generated method stub
		String sql="delete from players where name=?";
		try (
			Connection conn=JDBC.getConnection();
			PreparedStatement ps=conn.prepareStatement(sql);)
		{
			return ps.executeUpdate()>0;
							
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	
		
		return false;
	}

	@Override
	public List<Player> rangeBid(double min, double max) {
		// TODO Auto-generated method stub
		List<Player> l=new ArrayList<>();
		String sql="select * from players where bid>=? and bid<=? ";
		try(Connection conn=JDBC.getConnection();
				PreparedStatement ps=conn.prepareStatement(sql))
		{ps.setDouble(1,min);
		ps.setDouble(2, max);
		ResultSet re=ps.executeQuery();
		while(re.next())
		{
			l.add(new Player (re.getInt(3),re.getString(1),re.getString(2),re.getString(4)));
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
	}

	@Override
	public List<Player> batsman() {
		// TODO Auto-generated method stub
		List<Player> l=new ArrayList<>();
		String sql="select * from players where role=? ";
		try(Connection conn=JDBC.getConnection();
				PreparedStatement ps=conn.prepareStatement(sql))
		{ps.setString(1,"Batsman");
		
		ResultSet re=ps.executeQuery();
		while(re.next())
		{
			l.add(new Player (re.getInt(3),re.getString(1),re.getString(2),re.getString(4)));
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
		
	}

	@Override
	public List<Player> bowler() {
		// TODO Auto-generated method stub
		List<Player> l=new ArrayList<>();
		String sql="select * from players where role=? ";
		try(Connection conn=JDBC.getConnection();
				PreparedStatement ps=conn.prepareStatement(sql))
		{ps.setString(1,"Bowler");
		
		ResultSet re=ps.executeQuery();
		while(re.next())
		{
			l.add(new Player (re.getInt(3),re.getString(1),re.getString(2),re.getString(4)));
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
		
	}

	@Override
	public List<Player> teamPlayers(String team) {
		// TODO Auto-generated method stub
		List<Player> l=new ArrayList<>();
		String sql="select * from players where team=? ";
		try(Connection conn=JDBC.getConnection();
				PreparedStatement ps=conn.prepareStatement(sql))
		{ps.setString(1,team);
		
		ResultSet re=ps.executeQuery();
		while(re.next())
		{
			l.add(new Player (re.getInt(3),re.getString(1),re.getString(2),re.getString(4)));
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
		
	}

	@Override
	public List<Player> teamBatsman(String team) {
		// TODO Auto-generated method stub
		List<Player> l=new ArrayList<>();
		String sql="select * from players where role=? and team=?";
		try(Connection conn=JDBC.getConnection();
				PreparedStatement ps=conn.prepareStatement(sql))
		{ps.setString(1,"Batsman");
		ps.setString(2,team);
		ResultSet re=ps.executeQuery();
		while(re.next())
		{
			l.add(new Player (re.getInt(3),re.getString(1),re.getString(2),re.getString(4)));
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return l;
		
		
	}

	@Override
	public List<Player> teamBowler(String team) {
		List<Player> l=new ArrayList<>();
		String sql="select * from players where role=? and team=?";
		try(Connection conn=JDBC.getConnection();
				PreparedStatement ps=conn.prepareStatement(sql))
		{ps.setString(1,"Bowler");
		ps.setString(2,team);
		ResultSet re=ps.executeQuery();
		while(re.next())
		{
			l.add(new Player (re.getInt(3),re.getString(1),re.getString(2),re.getString(4)));
		}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return l;
	}

}
