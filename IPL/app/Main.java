package IPL.app;

import java.util.List;
import java.util.Scanner;

import IPL.pojo.Player;
import IPL.service.PlayerService;
import IPL.service.PlayerServiceImpl;
import IPL.service.playernotfoundexception;
import IPL.service.teamnotfound;

public class Main {

    public static void main(String[] args) {

        PlayerService service = new PlayerServiceImpl();
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

            try {

                switch (choice) {

                case 1:

                    System.out.print("Enter player name: ");
                    String pname = sc.nextLine();

                    System.out.println(service.searchPlayer(pname));

                    break;

                case 2:

                    System.out.print("Enter player name: ");
                    pname = sc.nextLine();

                    if (service.deletePlayer(pname))
                        System.out.println("Player deleted successfully.");

                    break;

                case 3:

                    System.out.print("Enter minimum bid: ");
                    double min = sc.nextDouble();

                    System.out.print("Enter maximum bid: ");
                    double max = sc.nextDouble();

                    List<Player> rangePlayers = service.rangeBid(min, max);

                    if (rangePlayers.isEmpty())
                        System.out.println("No players found.");
                    else
                        rangePlayers.forEach(System.out::println);

                    break;

                case 4:

                    service.batsman().forEach(System.out::println);

                    break;

                case 5:

                    service.bowler().forEach(System.out::println);

                    break;

                case 6:

                    System.out.print("Enter Team Name: ");
                    String team = sc.nextLine().toUpperCase();

                    service.teamPlayers(team).forEach(System.out::println);

                    break;

                case 7:

                    System.out.print("Enter Team Name: ");
                    team = sc.nextLine().toUpperCase();

                    service.teamBatsman(team).forEach(System.out::println);

                    break;

                case 8:

                    System.out.print("Enter Team Name: ");
                    team = sc.nextLine().toUpperCase();

                    service.teamBowler(team).forEach(System.out::println);

                    break;

                case 9:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice.");

                }

            } catch (playernotfoundexception e) {

                System.out.println(e.getMessage());

            } catch (teamnotfound e) {

                System.out.println(e.getMessage());

            } catch (Exception e) {

                e.printStackTrace();

            }

        } while (choice != 9);

        sc.close();
    }
}