import java.util.ArrayList;

public class CardDeck {
  public ArrayList <Card> deck = new ArrayList <Card> ();
  
  private String[] suits = {"diamonds", "hearts", "clubs", "spades"};
  private String[] values = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};

  //constructor - make deck of cards
  public CardDeck() {
    for (int i = 0; i < suits.length; i++) {
      for (int j = 0; j < values.length; j++) {
        deck.add(new Card(suits[i], values[j]));
      }
    }
    deck.add(new Card(null, "joker"));
    deck.add(new Card(null, "joker"));
    if (deck.size() == 54){
      System.out.println("Deck of cards created successfully!");
    } else {
      System.out.println("Something went wrong");
    }
  }

  //tostring for deck
  //TODO: make tostring better optimized
  public String toString(){
    String returnCards = "";
    for (Card c : deck) {
      if (c.getSuit() != null) {
        returnCards += (c.getValue() + " of " + c.getSuit() + "\n");
      } else {
        returnCards += (c.getValue() + "\n");
      }
    }
    return returnCards;
  }
}