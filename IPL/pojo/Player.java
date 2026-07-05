package IPL.pojo;

public class Player {
private double bid;
private String name;
private String team;
private String role;
public Player(double bid, String name, String team, String role) {
	super();
	this.bid = bid;
	this.name = name;
	this.team = team;
	this.role = role;
}
public double getBid() {
	return bid;
}
public void setBid(double bid) {
	this.bid = bid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTeam() {
	return team;
}
public void setTeam(String team) {
	this.team = team;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String toString()
{
	return "Player: "+" Team: "+team+" name: "+name+" bid: "+bid+" role: "+role;
}
}
