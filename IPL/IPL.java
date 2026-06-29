package IPL;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

class pair{
	private String name;
	private double bid;
	public pair(String name,double d)
	{
		this.setName(name);
		this.setBid(d);
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
}
public class IPL{
	public static void main(String[] args) throws teamnotfound {
		
		HashMap<String,List<pair>> IPL=new HashMap<String,List<pair>>();
		List<pair> csk=new ArrayList<>();
		csk.add(new pair("Ruturaj Gaikwad", 18.0));
        csk.add(new pair("Ravindra Jadeja", 18.0));
        csk.add(new pair("Matheesha Pathirana", 13.0));
        csk.add(new pair("Shivam Dube", 12.0));
        csk.add(new pair("MS Dhoni", 4.0));
        csk.add(new pair("Noor Ahmad", 10.0));
        csk.add(new pair("Ravichandran Ashwin", 9.75));
        csk.add(new pair("Devon Conway", 6.25));
        csk.add(new pair("Khaleel Ahmed", 4.80));
        csk.add(new pair("Rachin Ravindra", 4.00));
		IPL.put("CSK", csk);
		
        List<pair> mi=new ArrayList<>();
        mi.add(new pair("Jasprit Bumrah", 18.00));
        mi.add(new pair("Suryakumar Yadav", 16.35));
        mi.add(new pair("Hardik Pandya", 16.35));
        mi.add(new pair("Rohit Sharma", 16.30));
        mi.add(new pair("Tilak Varma", 8.00));

        mi.add(new pair("Trent Boult", 12.50));
        mi.add(new pair("Deepak Chahar", 9.25));
        mi.add(new pair("Naman Dhir", 5.25));
        mi.add(new pair("Will Jacks", 5.25));
        mi.add(new pair("Robin Minz", 65.00));
        mi.add(new pair("Ryan Rickelton", 1.00));
        IPL.put("MI", mi);
        List<pair> rcb=new ArrayList<>();
        rcb.add(new pair("Virat Kohli", 21.00));
        rcb.add(new pair("Rajat Patidar", 11.00));
        rcb.add(new pair("Yash Dayal", 5.00));

        // Auction Buys
        rcb.add(new pair("Josh Hazlewood", 12.50));
        rcb.add(new pair("Phil Salt", 11.50));
        rcb.add(new pair("Jitesh Sharma", 11.00));
        rcb.add(new pair("Bhuvneshwar Kumar", 10.75));
        rcb.add(new pair("Liam Livingstone", 8.75));
        rcb.add(new pair("Rasikh Dar", 6.00));
        rcb.add(new pair("Krunal Pandya", 5.75));
        IPL.put("RCB", rcb);
        List<pair> kkr=new ArrayList<>();
        kkr.add(new pair("Rinku Singh", 13.00));
        kkr.add(new pair("Varun Chakaravarthy", 12.00));
        kkr.add(new pair("Sunil Narine", 12.00));
        kkr.add(new pair("Andre Russell", 12.00));
        kkr.add(new pair("Harshit Rana", 4.00));
        kkr.add(new pair("Ramandeep Singh", 4.00));

        // Auction Buys
        kkr.add(new pair("Venkatesh Iyer", 23.75));
        kkr.add(new pair("Quinton de Kock", 3.60));
        kkr.add(new pair("Rahmanullah Gurbaz", 2.00));
        kkr.add(new pair("Anrich Nortje", 6.50));
        kkr.add(new pair("Spencer Johnson", 2.80));
        kkr.add(new pair("Vaibhav Arora", 1.80));
        IPL.put("KKR", kkr);
        List<pair> srh = new ArrayList<>();

     // Retained Players
     srh.add(new pair("Heinrich Klaasen", 23.00));
     srh.add(new pair("Pat Cummins", 18.00));
     srh.add(new pair("Abhishek Sharma", 14.00));
     srh.add(new pair("Travis Head", 14.00));
     srh.add(new pair("Nitish Kumar Reddy", 6.00));

     // Auction Buys
     srh.add(new pair("Mohammed Shami", 10.00));
     srh.add(new pair("Harshal Patel", 8.00));
     srh.add(new pair("Ishan Kishan", 11.25));
     srh.add(new pair("Rahul Chahar", 3.20));
     srh.add(new pair("Adam Zampa", 2.40));
     srh.add(new pair("Simarjeet Singh", 1.50));
     srh.add(new pair("Brydon Carse", 1.00));
     srh.add(new pair("Kamindu Mendis", 0.75));
     IPL.put("SRH", srh);
     List<pair> dc = new ArrayList<>();

     dc.add(new pair("Axar Patel", 16.50));
     dc.add(new pair("Kuldeep Yadav", 13.25));
     dc.add(new pair("Tristan Stubbs", 10.00));
     dc.add(new pair("KL Rahul", 14.00));
     dc.add(new pair("Mitchell Starc", 11.75));
     dc.add(new pair("T Natarajan", 10.75));
     dc.add(new pair("Jake Fraser-McGurk", 9.00));
     dc.add(new pair("Mukesh Kumar", 8.00));
     dc.add(new pair("Harry Brook", 6.25));
     dc.add(new pair("Ashutosh Sharma", 3.80));
     dc.add(new pair("Mohit Sharma", 2.20));
     dc.add(new pair("Faf du Plessis", 2.00));
     dc.add(new pair("Sameer Rizvi", 0.95));
     dc.add(new pair("Karun Nair", 0.50));
     dc.add(new pair("Darshan Nalkande", 0.30));
     dc.add(new pair("Vipraj Nigam", 0.50));
     dc.add(new pair("Dushmantha Chameera", 0.75));
     dc.add(new pair("Donovan Ferreira", 0.75));
     IPL.put("DC", dc);
     List<pair> gt = new ArrayList<>();

     gt.add(new pair("Shubman Gill", 16.50));
     gt.add(new pair("Rashid Khan", 18.00));
     gt.add(new pair("Sai Sudharsan", 8.50));
     gt.add(new pair("Rahul Tewatia", 4.00));
     gt.add(new pair("Shahrukh Khan", 4.00));

     gt.add(new pair("Jos Buttler", 15.75));
     gt.add(new pair("Mohammed Siraj", 12.25));
     gt.add(new pair("Kagiso Rabada", 10.75));
     gt.add(new pair("Prasidh Krishna", 9.50));
     gt.add(new pair("Washington Sundar", 3.20));
     gt.add(new pair("Gerald Coetzee", 2.40));
     gt.add(new pair("Glenn Phillips", 2.00));
     gt.add(new pair("Sherfane Rutherford", 2.60));
     gt.add(new pair("Sai Kishore", 2.00));
     IPL.put("GT", gt);
     List<pair> rr = new ArrayList<>();

     rr.add(new pair("Sanju Samson", 18.00));
     rr.add(new pair("Yashasvi Jaiswal", 18.00));
     rr.add(new pair("Riyan Parag", 14.00));
     rr.add(new pair("Dhruv Jurel", 14.00));
     rr.add(new pair("Shimron Hetmyer", 11.00));
     rr.add(new pair("Sandeep Sharma", 4.00));

     rr.add(new pair("Jofra Archer", 12.50));
     rr.add(new pair("Maheesh Theekshana", 4.40));
     rr.add(new pair("Wanindu Hasaranga", 5.25));
     rr.add(new pair("Nitish Rana", 4.20));
     rr.add(new pair("Tushar Deshpande", 6.50));
     rr.add(new pair("Fazalhaq Farooqi", 2.00));
     rr.add(new pair("Akash Madhwal", 1.20));
     rr.add(new pair("Kwena Maphaka", 1.50));
     IPL.put("RR", rr);
			System.out.println("IPL Teams");
			System.out.println("RCB");
			System.out.println("MI");
			System.out.println("RR");
			System.out.println("GT");
			System.out.println("CSK");
			System.out.println("KKR");
			System.out.println("SRH");
			System.out.println("DC");
			System.out.println("Enter the team");
			Scanner sc=new Scanner(System.in);
			String s=sc.next();
			s=s.toUpperCase();
			boolean f = false;
			if(IPL.containsKey(s))
			{
			    List<pair> team = IPL.get(s);

			    System.out.println("Players of " + s);

			    for(pair p : team)
			    {
			        System.out.println("---------------------------");
			        System.out.println("Name : " + p.getName());
			        System.out.println("Bid  : " + p.getBid() + " Cr");
			    }
			    f=true;
			}
			if(f)
				return;
			else throw new teamnotfound("team not found");
	}
}

			
			
	


