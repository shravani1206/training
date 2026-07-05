package IPL.service;

import java.util.List;

import IPL.dao.PlayerDao;
import IPL.dao.PlayerDaoimpl;
import IPL.pojo.Player;

public class PlayerServiceImpl implements PlayerService {

    PlayerDao dao = new PlayerDaoimpl();

    @Override
    public Player searchPlayer(String name) throws playernotfoundexception {

        Player p = dao.searchPlayer(name);

        if (p == null) {
            throw new playernotfoundexception("Player " + name + " not found.");
        }

        return p;
    }

    @Override
    public boolean deletePlayer(String name) throws playernotfoundexception {

        Player p = dao.searchPlayer(name);

        if (p == null) {
            throw new playernotfoundexception("Player " + name + " not found.");
        }

        return dao.deletePlayer(name);
    }

    @Override
    public List<Player> rangeBid(double min, double max) {

        return dao.rangeBid(min, max);

    }

    @Override
    public List<Player> batsman() {

        return dao.batsman();

    }

    @Override
    public List<Player> bowler() {

        return dao.bowler();

    }

    @Override
    public List<Player> teamPlayers(String team) throws teamnotfound {

        List<Player> list = dao.teamPlayers(team);

        if (list.isEmpty()) {
            throw new teamnotfound("Team " + team + " not found.");
        }

        return list;
    }

    @Override
    public List<Player> teamBatsman(String team) throws teamnotfound {

        List<Player> list = dao.teamBatsman(team);

        if (list.isEmpty()) {
            throw new teamnotfound("No batsmen found in team " + team);
        }

        return list;
    }

    @Override
    public List<Player> teamBowler(String team) throws teamnotfound {

        List<Player> list = dao.teamBowler(team);

        if (list.isEmpty()) {
            throw new teamnotfound("No bowlers found in team " + team);
        }

        return list;
    }

}