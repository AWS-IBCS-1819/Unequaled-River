// created by Kitty Liu
// 2018.9.11
// this is a booklet about student's information in Kittyland

// do you create another file for AboutMe????

import java.util.*;


public class AboutMe {

  //define variables
  public static String name;
  public String nationality;
  public String hairColor;
  public int age;
  public int bookHaveRead;
  public int placeHaveTraveled;
  public int mealsHaveEaten;


  public static int year;

  public static void changeYear() {
    System.out.println("=====================================");
    System.out.println("    This is " + year);
    System.out.println("How many years has passed?");

    Scanner inputInt = new Scanner(System.in); //interact with the user~
    String yearResult =  inputInt.next();
    int yearResultNumber = Integer.parseInt(yearResult);
    year = year + yearResultNumber;
    System.out.println("This is " + year + "! \nThings have changed! Go & check them!");
    System.out.println("=====================================");
  }


  public AboutMe() {
    nationality = "Chinese";
    name = "Maggie"; // assign the name to the static var
    hairColor = "Black";
    bookHaveRead = 100;
    placeHaveTraveled = 6;
    mealsHaveEaten = 19710;
    age = 18;
  }

  public void updateAge (int year){
    int numbersOfYearPassed = year - 2018;
    this.age = 18 + numbersOfYearPassed;
  }
  public void updatebookHaveRead (int year){
    int numbersOfYearPassed = year - 2018;
    this.bookHaveRead = 100 + numbersOfYearPassed*15;
  }
  public void updateplaceHaveTraveled (int year){
    int numbersOfYearPassed = year - 2018;
    this.placeHaveTraveled = 6 + numbersOfYearPassed*4;
  }
  public void updatemealsHaveEaten (int year){
    int numbersOfYearPassed = year - 2018;
    this.mealsHaveEaten = 19710 + numbersOfYearPassed*365*3;
  }

  public static void main(String[] args) {
    // call constructor method
    AboutMe maggie = new AboutMe();
//------------------

    year = 2018; //can be later changed
    System.out.println("Welcome to Magic-life book!");
    System.out.println("This is " + year);
    System.out.println("You can change the year to see student's future information");
    System.out.println("But now, let's first check student's current information!! \n (type 'yes' to continue)");
    System.out.print("  "); Scanner q1 = new Scanner(System.in);
    String checkYes1 =  q1.next();
    if (checkYes1.equals("yes")) {
      System.out.println("-------------------------------");
      System.out.println("Student name: " + maggie.name);
      System.out.println("Hair color: " + maggie.hairColor);
      System.out.println("Nationality: " + maggie.nationality);
      System.out.println("Age: " + maggie.age);
      System.out.println("Number of books she have read: " + maggie.bookHaveRead);
      System.out.println("Number of places she have been: " + maggie.placeHaveTraveled);
      System.out.println("Number of meals she have eaten: " + maggie.mealsHaveEaten);
      System.out.println("-------------------------------");
      System.out.println("Now, let's see the future!! \n (type 'yes' to continue)");
      System.out.print("  "); Scanner q2 = new Scanner(System.in);
      String checkYes2 =  q2.next();
      if (checkYes1.equals("yes")) {
        changeYear();
        System.out.println("Check to see the student in " + year + " ! \n (type 'yes' to continue)");
        System.out.print("  "); Scanner q3 = new Scanner(System.in);
        String checkYes3 =  q3.next();
        if (checkYes3.equals("yes")) {
          System.out.println("-------------------------------");
          System.out.println("Student name: " + maggie.name);
          System.out.println("Hair color: " + maggie.hairColor);
          System.out.println("Nationality: " + maggie.nationality);
          maggie.updateAge(year);
          maggie.updatebookHaveRead(year);
          maggie.updateplaceHaveTraveled(year);
          maggie.updatemealsHaveEaten(year);
          System.out.println("Age: " + maggie.age);
          System.out.println("Number of books she have read: " + maggie.bookHaveRead);
          System.out.println("Number of places she have been: " + maggie.placeHaveTraveled);
          System.out.println("Number of meals she have eaten: " + maggie.mealsHaveEaten);
          System.out.println("-------------------------------");
        }
      }
    }







  }
}
