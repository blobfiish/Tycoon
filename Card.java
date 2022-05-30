public class Card {
  
  private String suit = "";
  private String value = "";
  
  public Card (String suit, String value) {
    this.suit = suit;
    this.value = value;
  }

  public String getSuit() {
    return this.suit;
  }

  public String getValue() {
    return this.value;
  }
}