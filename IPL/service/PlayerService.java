package IPL.service;

import java.util.List;

import IPL.pojo.Player;

public interface PlayerService {
	Player searchPlayer(String name) throws playernotfoundexception;

	boolean deletePlayer(String name) throws playernotfoundexception;

	List<Player> rangeBid(double min, double max) throws playernotfoundexception;

	List<Player> batsman();

	List<Player> bowler();

	List<Player> teamPlayers(String team) throws teamnotfound;

	List<Player> teamBatsman(String team) throws teamnotfound;

	List<Player> teamBowler(String team)throws teamnotfound;
}
