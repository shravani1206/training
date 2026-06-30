package IPL;

import java.util.List;

public interface iplinterface<t> {
public Pair SearchPlayer(String name);
public boolean DeletePlayer(String name);
public List<t> RangeBid(int a,int b);
public List<t> Bater();
public List<t> bowler();
public List<t> TeamWisePlayer(String team);
public List<t> TeamWiseBater(String team);
public List<t> TeamWiseBowler(String team);
}
