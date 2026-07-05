package IPL.dao;

import java.util.List;

import IPL.pojo.Player;

public interface PlayerDao {

	Player searchPlayer(String name);

	boolean deletePlayer(String name);

	List<Player> rangeBid(double min, double max);

	List<Player> batsman();

	List<Player> bowler();

	List<Player> teamPlayers(String team);

	List<Player> teamBatsman(String team);

	List<Player> teamBowler(String team);

}
