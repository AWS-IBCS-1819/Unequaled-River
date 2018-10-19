/* Pokerhand.java by Mr. Considine
This class holds all of the data and methods for
generating poker hands using arrays. */
import java.util.*;

public class Pokerhand {

  Deck d;

  public Deck shuffle(Deck d) {
    Random r = new Random();
    ArrayList<String> shuffled = new ArrayList<String>();

    int[] ar = r.ints(5200, 0, 52).distinct().toArray();
    for (int i = 0; i < 52; i ++) {
      shuffled.add(d.cards.get(ar[i]));
    }
    d.cards = shuffled;
    return d;
  }

  public ArrayList<String> giveHand(Deck d) {

    ArrayList<String> hand = new ArrayList<String>(5);
    for (int i = 0; i < 5; i++) {
      hand.add(d.cards.get(i));
    }
    return hand;
  }

  public String evaluate(ArrayList<String> hand) {
    String result = "";
    int numD = 0;
    int numC = 0;
    int numH = 0;
    int numS = 0;

    for (int i = 0; i < 5; i++) {
      if (hand.get(i).contains("Diamonds")) {
        numD++;
      }
      else if (hand.get(i).contains("Clubs")) {
        numC++;
      }
      else if (hand.get(i).contains("Hearts")) {
        numH++;
      }
      else {
        numS++;
      }
    }

    if (numD == 5 || numC == 5 || numH == 5 || numS == 5) {
      result = "FLUSH";
      System.out.println(result);
      System.out.println(hand);
    }
    return result;
  }

  public Pokerhand() {
    d = new Deck();
  }

  public static void main(String[] args) {
    System.out.println("Number of hands dealt: 1000");

    Pokerhand p = new Pokerhand();
    //System.out.println(p.d.cards);
    for (int i = 0; i < 1000; i++) {
      p.d = p.shuffle(p.d);
      ArrayList<String> h = p.giveHand(p.d);
      //System.out.println(h);
      String res = p.evaluate(h);
    }

    //System.out.println(h);



  }

}
