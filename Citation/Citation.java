import java.util.*;
import java.io.*;

public class Citation{
  public static String AAN = null;

  public static String ArticleTitle;
  public static String AuthorFirst;
  public static String AuthorMiddle;
  public static String AuthorLast;
  public static String WebTitle;
  public static String Publisher;
  public static String URL;
  public static String DateDay;
  public static String DateMonth;
  public static String DateYear;

  public static ArrayList<Integer> numVal;

  public Citation(){
                    // String AT, String AF, String AM, String AL,
                    // String WT, String P, String U, String DD,
                    // String DM, String DY
      // ArticleTitle = AT;
      // AuthorFirst = AF;
      // AuthorMiddlen = AM;
      // AuthorLast = AL;
      // WebTitle = WT;
      // Publisher = P;
      // URL = U;
      // DateDay = DD;
      // DateMonth = DM;
      // DateYear = DY;
  }

  public static String formatIntoString(){
    String end = null;

    String CAuthorLast = AuthorLast + ", ";
    String CAuthorFirst = AuthorFirst + " ";
    String CAuthorMiddle = AuthorMiddle + ". ";
    String CArticleTitle = "\"" + ArticleTitle + "\" ";
    String CPublisher = Publisher + ", ";
    String CDateDay = DateDay + " ";
    String CDateMonth = DateMonth + " ";
    String CDateYear = DateYear + ", ";
    String CURL = URL + ".";

    if (AuthorLast != null) {end = CAuthorLast;}
    if (AuthorFirst != null) {end = end + CAuthorFirst;}
    if (AuthorMiddle != null) {end = end + CAuthorMiddle;}
    if (ArticleTitle != null) {end = end + CArticleTitle;}
    if (Publisher != null) {end = end + CPublisher;}
    if (DateDay != null) {end = end + CDateDay;}
    if (DateMonth != null) {end = end + CDateMonth;}
    if (DateYear != null) {end = end + CDateYear;}
    if (URL != null) {end = end + CURL;}

    // String end = AuthorLast + ", " + AuthorFirst + " "
    // + AuthorMiddlen + ". " + "\"" + ArticleTitle + "\" "
    // + Publisher + ", " + DateDay + " " + DateMonth + " "
    // + DateYear + ", " + URL + ".";

    return end;
  }



  public static void setArticleTitle(String a){ArticleTitle = a;}
  public static void setAuthorFirst(String a){AuthorFirst = a;}
  public static void setAuthorMiddle(String a){AuthorMiddle = a;}
  public static void setAuthorLast(String a){AuthorLast = a;}
  public static void setWebTitle(String a){WebTitle = a;}
  public static void setPublisher(String a){Publisher = a;}
  public static void setURL(String a){URL = a;}
  public static void setDateDay(String a){DateDay = a;}
  public static void setDateMonth(String a){DateMonth = a;}
  public static void setDateYear(String a){DateYear = a;}

  public static void setNumVal(ArrayList<Integer> input){
    numVal = input;
  }

  public static ArrayList<Integer> getNumVal(){
    return numVal;
  }

  public static String getATorAN() {//get either article tile or author's name as string in order to sort

      if (AuthorLast != null) {
        AAN = AuthorLast;
      }else if (AuthorFirst != null) {
        AAN = AuthorFirst;
      }else if (AuthorMiddle != null) {
        AAN = AuthorMiddle;
      }else if (ArticleTitle != null) {
        AAN = ArticleTitle;
      }
      return AAN;
  }

}
