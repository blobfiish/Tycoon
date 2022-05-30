import java.util.ArrayList;
public class Game {
  ArrayList <Player> players = new ArrayList <Player>();
  
  public Game(int numplayers, int numcomputers) {
    for (int i = 1; i <= numplayers; i++) {
      players.add(new Player(false, "name" + i));
    }
    for (int j = 1; j <= numcomputers; j++) {
      players.add(new Player(true, "computer" + j));
    }
    
    CardDeck cardDeck = new CardDeck();
    //System.out.println(cardDeck);
  }
}