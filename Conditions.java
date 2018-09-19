// Conditions.java by Kitty Liu
// 2018/9/14

import java.util.*; // for scanner
import java.io.*; //for reading files

public class Conditions { // same name is NEEDED because ...it won't work if the name is dif.






  public static void main(String[] args) {
    StringBuilder mybuilder = new StringBuilder();

    try {
      File book = new File("PrideAndPrejudice.txt");
      Scanner sn = new Scanner(book);

      while (sn.hasNextLine()) { //check to see if have next line
        mybuilder.append(sn.nextLine() + " \n ");
      }
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    int count = 0;
    int num0 = 0;
    for (int i = 0; i < mybuilder.length() - 4; i++){
      if (mybuilder.substring(i, i+4).equals("love")) {
        System.out.println(mybuilder.substring(i, i+4));
        num0++;
      } else if (mybuilder.substring(i, i+4).equals("END*")) {
        break;
      }
    }

    System.out.println(mybuilder);
    System.out.println("number of love in the text: " + num0);
  }
}
