import java.util.Scanner;

public class GameRunner {
  private int numPlayers;
  private int numBots;
  public GameRunner() {

    //start game
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome!");
    System.out.println("Number of human players: ");
    numPlayers = sc.nextInt();
    System.out.println("Number of computer players: ");
    numBots = sc.nextInt();
    sc.close();
    Game game = new Game(numPlayers, numBots);
  }
}