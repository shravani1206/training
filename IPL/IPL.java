package IPL;


import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import IPL.service.playernotfoundexception;
import IPL.service.teamnotfound;


public class IPL {
	public static void main(String[] args) throws Throwable{
		Iplimpl obj=new Iplimpl();
		Scanner sc = new Scanner(System.in);
		
		int choice;

		do {

		    System.out.println("\n====== IPL MENU ======");
		    System.out.println("1. Search Player");
		    System.out.println("2. Delete Player");
		    System.out.println("3. Players in Bid Range");
		    System.out.println("4. Display All Batsmen");
		    System.out.println("5. Display All Bowlers");
		    System.out.println("6. Display Team Players");
		    System.out.println("7. Display Team Batsmen");
		    System.out.println("8. Display Team Bowlers");
		    System.out.println("9. Exit");

		    System.out.print("Enter your choice: ");
		    choice = sc.nextInt();
		    sc.nextLine();    

		    switch (choice) {

		    case 1:
		        System.out.print("Enter player name: ");
		        String pname = sc.nextLine();

		        Pair p = obj.SearchPlayer(pname);

		        if (p != null)
		            System.out.println(p);
		        else throw new playernotfoundexception("player not found");

		        break;

		    case 2:
		        System.out.print("Enter player name to delete: ");
		        pname = sc.nextLine();

		        if (obj.DeletePlayer(pname))
		            System.out.println("Player deleted successfully.");
		        else
		           throw new playernotfoundexception("player not found");

		        break;

		    case 3:
		        System.out.print("Enter minimum bid: ");
		        int min = sc.nextInt();

		        System.out.print("Enter maximum bid: ");
		        int max = sc.nextInt();

		        List<Pair> l4=obj.RangeBid(min, max);
		        if(l4.size()==0)
		        	System.out.println("no player in that range");
		        else
		        	l4.forEach(System.out::println);

		        break;

		    case 4:
		        obj.Bater().forEach(System.out::println);
		        break;

		    case 5:
		        obj.bowler().forEach(System.out::println);
		        break;

		    case 6:
		        System.out.print("Enter team name: ");
		        String team = sc.nextLine();
		        List<Pair> l2=obj.TeamWisePlayer(team);
		        if(l2==null) throw new teamnotfound("team not found");
		           l2.forEach(System.out::println);

		        break;

		    case 7:
		        System.out.print("Enter team name: ");
		        team = sc.nextLine();

		        List<Pair> l=obj.TeamWiseBater(team);
		        if(l==null) throw new teamnotfound("team not found");
		           l.forEach(System.out::println);

		        break;

		    case 8:
		        System.out.print("Enter team name: ");
		        team = sc.nextLine();

		        List<Pair> l1=obj.TeamWiseBowler(team);
		        if(l1==null) throw new teamnotfound("team not found");
		           l1.forEach(System.out::println);


		        break;

		    case 9:
		        System.out.println("Thank You!");
		        break;

		    default:
		        System.out.println("Invalid Choice");
		    }

		} while (choice != 9);

		sc.close();


	}
}

			
			
	


