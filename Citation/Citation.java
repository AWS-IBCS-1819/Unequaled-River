import java.util.*;
import java.io.*;

public class Citation{
  public String ArticleTitle;
  public String AuthorFirst;
  public String AuthorMiddle;
  public String AuthorLast;
  public String WebTitle;
  public String Publisher;
  public String URL;
  public String DateDay;
  public String DateMonth;
  public String DateYear;

  public ArrayList<Integer> numVal;

  public Citation(String AT, String AF, String AM, String AL,
                  String WT, String P, String U, String DD,
                  String DM, String DY){
      ArticleTitle = AT;
      AuthorFirst = AF;
      AuthorMiddlen = AM;
      AuthorLast = AL;
      WebTitle = WT;
      Publisher = P;
      URL = U;
      DateDay = DD;
      DateMonth = DM;
      DateYear = DY;
  }

  public String formatIntoString(){
    String end = AuthorLast + ", " + AuthorFirst + " " + AuthorMiddlen +
  }

  public void setNumVal(ArrayList<Integer> input){
    numVal = input;
  }

  public ArrayList<Integer> geyNumVal(){
    return numVal;
  }

  public String getATorAN() {//get either article tile or author's name as string in order to sort
      String end;
      if (ArticleTitle != null) {
        end = ArticleTitle;
      }
  }

}
