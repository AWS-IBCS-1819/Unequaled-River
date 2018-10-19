//Kitty Liu
//still have problem with quit
import java.util.*;

public class Blackjack {

  Deck d;
  ArrayList<Card> userHand;
  ArrayList<Card> compHand;

  public Blackjack() {
    d = new Deck();
    userHand = new ArrayList<Card>();
    compHand = new ArrayList<Card>();
  }

  public boolean checkStop(int v){
    // use to check if user win/lose in the middle
    //if so, no need for final comparison
    if (v == 21) {
      System.out.println("You win!");
      return true;
    } else if (v > 21) {
      System.out.println("Bust!");
      System.out.println("You lose!");
      return true;
    }
    return false;
  }

  public void printHand(ArrayList<Card> h){
    for (int i = 0; i < h.size(); i ++) {
      System.out.print("  ");
      System.out.println(h.get(i).getName());
    }
  }

  public Integer calculateHand(ArrayList<Card> h) {
    int totalValue = 0;

    for (int i = 0; i < h.size(); i ++) {

      totalValue = totalValue + h.get(i).getValue();
    }
    return totalValue;
  }


  public static void main(String[] args) {



    while (true){ // to create an infinite loop allowing user to play again
      Blackjack b = new Blackjack();
      boolean enterComponent = false;
      boolean stopInMiddle = false;
      //default at beginning of every game: (draw 2 cards each person)
        System.out.println("");
        System.out.println("");
        System.out.println("Welcome to Blackjack.");
        b.d.reset();
        b.d.shuffle();

        b.userHand.add(b.d.drawCard());
        b.userHand.add(b.d.drawCard());
        b.compHand.add(b.d.drawCard());
        b.compHand.add(b.d.drawCard());
      // ----end of defalt----

      System.out.println("");
      System.out.println("------------------");
      System.out.println("Here is your hand:");
      b.printHand(b.userHand);
      System.out.println("Total value: " + b.calculateHand(b.userHand));
      System.out.println("------");
      System.out.print("Your opponent is showing a ");
      System.out.println(b.compHand.get(0).getName());
      System.out.println("------------------");
      if (b.checkStop(b.calculateHand(b.userHand)) == true) {
        stopInMiddle = true;
        break;
      }



      while (true) {
        System.out.println("");
        System.out.println("What would you like to do?");
        System.out.println("1. Hit");
        System.out.println("2. Stay");
        System.out.println("3. Quit");
        System.out.println("");

        Scanner input2 = new Scanner (System.in); //scanner for Play again?
        String whatToDo = input2.next();

        if (whatToDo.equals("1")) {
          System.out.println("------------------");
          b.userHand.add(b.d.drawCard());
          System.out.print("You drew a ");
          System.out.println(b.userHand.get(b.userHand.size() - 1).getName()); //to print what user just drew
          System.out.println("");

          System.out.println("Here is your hand:");
          b.printHand(b.userHand);
          System.out.println("Total value: " + b.calculateHand(b.userHand));
          if (b.checkStop(b.calculateHand(b.userHand)) == true) {
            stopInMiddle = true;
            break;
          }
        }else if (whatToDo.equals("2")){
          enterComponent = true;
          break;

        }else {
          System.exit(0); // ends program immediately
        }
      }

      if (enterComponent == true){
        System.out.println("------------------");
        while (true) {

          System.out.println("Your opponent's hand:");
          b.printHand(b.compHand);
          System.out.println("Total value: " + b.calculateHand(b.compHand));
          if (b.calculateHand(b.compHand) > 16) {
            break; //start to compare the total value
          } else {
            System.out.println("------------------");
            b.compHand.add(b.d.drawCard());
            System.out.print("Your opponent drew a ");
            System.out.println(b.compHand.get(b.compHand.size() - 1).getName());
            System.out.println("");
          }
        }
      }


      if (stopInMiddle == false) {//prevent it to check after user already win/lose in the middle
        if (b.calculateHand(b.compHand) == 21) { //component = 21
          System.out.println("You lose!");
        } else if (b.calculateHand(b.compHand) > 21) { //component > 21
          System.out.println("Bust!");
          System.out.println("You win!");
        } else if (b.calculateHand(b.compHand) > b.calculateHand(b.userHand)) { // component is bigger
          System.out.println("You lose!");
        } else if (b.calculateHand(b.compHand) < b.calculateHand(b.userHand)) { // you are bigger
          System.out.println("You win!");
        }
      }


      //-------------------------
      System.out.println("");
      System.out.println("Play again?");
      System.out.println("1. Yes");
      System.out.println("2. No");
      System.out.println("");

      Scanner input1 = new Scanner (System.in); //scanner for Play again?
      String whetherPlayAgain = input1.next();

      if (whetherPlayAgain.equals("1")) {

      }else if (whetherPlayAgain.equals("2")){
        System.exit(0); // ends program from looping infinitely
      }
    }//while loop

  }//main

}
