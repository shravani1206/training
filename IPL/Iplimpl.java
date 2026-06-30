package IPL;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class Pair{
	private String name;
	private double bid;
	private String role;
	public Pair(String name,double d,String r)
	{
		this.setName(name);
		this.setBid(d);
		this.setRole(r);
	}
	private void setRole(String r) {
		// TODO Auto-generated method stub
		this.role=r;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBid() {
		return bid;
	}
	public void setBid(double bid) {
		this.bid = bid;
	}
	public String getRole() {
		return role;
	}
	public String toString()
	{
		return "player: "+name+" bid amount: "+bid+" role: "+role;
	}
}
public class Iplimpl implements iplinterface {
	public Iplimpl() throws Exception {
	    // constructor code
	}
Map<String,List<Pair>> ipl=Files.lines(Paths.get("C:\\Users\\Shravani\\Downloads\\ipl_players.txt")).map(line->line.split(",")).
collect(Collectors.groupingBy(data->data[0],Collectors.mapping(data->new Pair(data[1].trim(),Integer.parseInt(data[2]),data[3].trim()),Collectors.toList())));

	@Override
	public Pair SearchPlayer(String name) {
		
		return ipl.values().stream().flatMap(List::stream).filter(p->p.getName().equalsIgnoreCase(name)).findFirst()
	            .orElse(null);
	}

	@Override
	public boolean DeletePlayer(String name) {
		// TODO Auto-generated method stub
		
		return ipl.values().stream().anyMatch(list ->list.removeIf(p -> p.getName().equalsIgnoreCase(name)));
		
	}

	@Override
	public List RangeBid(int a, int b) {
		// TODO Auto-generated method stub
		List<Pair> l=ipl.values().stream().flatMap(List::stream).filter(p->p.getBid()>a && p.getBid()<b).collect(Collectors.toList());
		return l;
	}

	@Override
	public List Bater() {
		// TODO Auto-generated method stub
		List<Pair> l=ipl.values().stream().flatMap(List::stream).filter(p->p.getRole().equalsIgnoreCase("Batsman")).collect(Collectors.toList());
		return l;
	}

	@Override
	public List bowler() {
		// TODO Auto-generated method stub
		List<Pair> l=ipl.values().stream().flatMap(List::stream).filter(p->p.getRole().equalsIgnoreCase("bowler")).collect(Collectors.toList());
		return l;
		
	}

	@Override
	public List TeamWisePlayer(String team) {
		// TODO Auto-generated method stub
		
		List<Pair> t=ipl.get(team.toUpperCase());
		return t;
	}

	@Override
	public List TeamWiseBater(String team) {
		// TODO Auto-generated method stub
		List<Pair> t=ipl.get(team.toUpperCase()).stream().filter(f->f.getRole().equalsIgnoreCase("Batsman")).collect(Collectors.toList());
		return t;
	}

	@Override
	public List TeamWiseBowler(String team) {
		// TODO Auto-generated method stub
		List<Pair> t=ipl.get(team.toUpperCase()).stream().filter(f->f.getRole().equalsIgnoreCase("bowler")).collect(Collectors.toList());
		return t;
	}

}
