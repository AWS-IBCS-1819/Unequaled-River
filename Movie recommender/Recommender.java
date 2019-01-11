// Recommender.java
// This program holds all of the methods and
// variables for recommending a movie for a friend
// to watch.
// The two approaches here are content-based filtering
// and collaborative filtering. They both read files
// that have respective data in order to score the movies.
// The program outputs a list of the top 3 recommendations
// for that person.
import java.util.*;
import java.io.*;

public class Recommender {
  public Recommender(){

  }

  public void collaborative(String movieName) {
    String[] MovieName = new String[14];
    String[] Friend1 = new String[14];
    String[] Friend2 = new String[14];
    String[] Friend3 = new String[14];
    String[] Friend4 = new String[14];
    String[] Friend5 = new String[14];
    String[] Friend6 = new String[14];
    String[] Friend7 = new String[14];
    String[] Friend8 = new String[14];

    try{
      File collab = new File("collab.txt");
      Scanner sn = new Scanner(collab);//read collab file



        for (int i=0;i<=13;i++ ) {
          MovieName[i] = sn.next();
          Friend1[i] = sn.next();
          Friend2[i] = sn.next();
          Friend3[i] = sn.next();
          Friend4[i] = sn.next();
          Friend5[i] = sn.next();
          Friend6[i] = sn.next();
          Friend7[i] = sn.next();
          Friend8[i] = sn.next();
          sn.nextLine();
        }

    }
    catch(FileNotFoundException e){
      e.printStackTrace();
    }

    //find index of movie
    int b = 999;
    for (int i=0;i<=13;i++ ) {
      if (movieName.equals(MovieName[i])) {
        b = i;
        break;
      }
    }
    //System.out.println(b);




    String[][] FriendNames = new String[][];

    if (Friend1[b].equals("1")) {
      //record the friend's name
      FriendNames[][] = Friend1[b];
    }






    //print top 3 recommendations
  }

  public void contentBased(String movieName) {
    //read contentBased file
    //print top 3 recommendations
  }

  public static void main(String[] args) {
    Recommender newRec = new Recommender();
    newRec.collaborative("TheBigShort");
        //print Welcome
    //print list of movies
    //ask which one user has seen
    //scan for the input
    //call recommendation methods

    //if possible go again
  }
}
