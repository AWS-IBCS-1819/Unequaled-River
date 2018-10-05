// created by Kitty Liu
// 2018.10.5
// (diamonds, clubs, hearts, spades)

import java.util.*;

public class Deck {

  ArrayList<String> cards;

  public Deck() {
    cards = new ArrayList<String>();
    int count = 1;
    String name = " ";

    for (int i = 0; i < 10; i++) {
      cards.add(count + " of Diamonds");
      cards.add(count + " of Clubs");
      cards.add(count + " of Hearts");
      cards.add(count + " of Spades");
      count++;
    }

    for (int i = 0; i < 3; i++) {
      if (i == 0) {
        name = "Jack";
      } else if (i == 1) {
        name = "Queen";
      } else if (i == 2) {
        name = "King";
      }
      cards.add(name + " of Diamonds");
      cards.add(name + " of Clubs");
      cards.add(name + " of Hearts");
      cards.add(name + " of Spades");

    }
  }





}
