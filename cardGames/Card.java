/* Card.java created by Mr. Considine
This file holds all of the data and methods
for a playing card to be used in Deck and Pokerhand
*/

public class Card {

  int value;
  String name;

  public void setName(String n) {
    name = n;
  }

  public void setValue(int v) {
    value = v;
  }

  public String getName() {
    return name;
  }

  public Integer getValue() {
    return value;
  }

  public Card() {
    name = "";
    value = 0;
  }

}
