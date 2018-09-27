import java.util.*;
import java.io.*;

public class Gradebook {


  public static void main(String[] args) {
    // new StringBuilder
    StringBuilder build = new StringBuilder(); // for Student's names
    StringBuilder buildWaste = new StringBuilder(); // for colon
    StringBuilder buildGrade = new StringBuilder(); // for grades
    StringBuilder buildTitle = new StringBuilder(); // for top line
    try {
      File grades = new File("grades.txt");
      Scanner sn = new Scanner(grades); // read the text-file

      if (sn.hasNextLine()) { // check if it has nextLine
        buildTitle.append(sn.nextLine()); // add the next line into StringBuilder that holds class name and teacher's name
      }

      while (sn.hasNext()) { //check to see if have next item
        build.append(sn.next());
        build.append(" "); // add space for formatting
        build.append(sn.next());
        build.append("\n"); // add return for formatting
        buildWaste.append(sn.next());
        buildGrade.append(sn.next());
      }

      // for comparison for grade spread
      Double d1; // the grades that we read from text-file
      Double topGrade = 0.0;
      Double lowestGrade = 100.0;
      Double total = 0.0;
      Double count = 0.0;
      // the integers for containing the number of grade (ABCDF)
      int counta = 0;
      int countb = 0;
      int countc = 0;
      int countd = 0;
      int countf = 0;

      for (int i = 0; i < buildGrade.length() - 4 ; i = i + 5) {
        // read through the StringBuilder that hold grade and %
        // to skip 4 indexes each time
        // "i < buildGrade.length() - 4"  to prevent overflow

        d1 = Double.parseDouble(buildGrade.substring(i, i+4));
        // read the 3 indexes and parse into double for comparison

        // to compare
        if (d1 >= 90.0) {
          counta = counta + 1;
        }else if (d1 >= 80){
          countb = countb + 1;
        }else if (d1 >= 70){
          countc = countc + 1;
        }else if (d1 >= 60){
          countd = countd + 1;
        }else if (d1 >= 50){
          countf = countf + 1;
        }

        //for mean
        total = total + d1;
        count = count + 1.0; // taking the denominator to find mean

        //for topGrade
        if (topGrade == 0) {
          topGrade = d1;
        }else if (d1 > topGrade){ // to find the biggest #
          topGrade = d1;
        }
        //lowest grade
        if (lowestGrade == 100) {
          lowestGrade = d1;
        }else if (d1 < lowestGrade){ // to find the smallest #
          lowestGrade = d1;
        }

      }

    Double mean = total/count; // calculation for mean




//======to print everything in format==========

    while (true) {
      System.out.println("============================");
      System.out.println("What would you like to know?");
      System.out.println("1) Mean Grade");
      System.out.println("2) Top Grade");
      System.out.println("3) Lowest Grade");
      System.out.println("4) Grade Spread");
      System.out.println("5) Student Roster");
      System.out.println("6) Teacher and Class title");
      System.out.println("7) Exit");
      System.out.println("============================");
      System.out.println("\n");

      // tip: Scanner needs to go after the initial introduction
      Scanner input = new Scanner (System.in); //creation of scanner
      String result = input.next();//tells scanner what to do


      if(result.equals("1")){
        System.out.println("\nThe mean grade is: " + mean + "%");
      } else if (result.equals("2")){
        System.out.println("\nThe top grade is: " + topGrade + "%");
      } else if (result.equals("3")){
        System.out.println("\nThe lowest grade is: " + lowestGrade + "%");
      } else if (result.equals("4")){
        System.out.println("\nThe grade spread is: ");
        System.out.println("Number of As: " + counta);
        System.out.println("Number of Bs: " + countb);
        System.out.println("Number of Cs: " + countc);
        System.out.println("Number of Ds: " + countd);
        System.out.println("Number of Fs: " + countf);
      } else if (result.equals("5")){
        System.out.println("\nThe roster is: \n" +  build);
      } else if (result.equals("6")){
        System.out.println("\nThe teacher and class name is: " + buildTitle);
      } else if (result.equals("7")) {
        System.exit(0); // ends program from looping infinitely
      }
    }


    }
    catch (FileNotFoundException e) { // if the file is not found, shows the error
      e.printStackTrace();
    }




  }
}
