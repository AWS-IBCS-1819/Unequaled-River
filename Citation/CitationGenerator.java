import java.util.*;
import java.io.*;


public class CitationGenerator {
  public ArrayList<Citation> CarrayList;

  public CitationGenerator(){ //constructor method
    CarrayList = new ArrayList<Citation>();
  }

  public ArrayList<Integer> assignNumVal(String input){
    input = input.toLowerCase();
    char[] charArray1 = input.toCharArray();
    ArrayList<Integer> numVal = new ArrayList<Integer>();
    for (int n = 0; n<charArray1.length; n++) {//to prevent it from getting to big
      char check = charArray1[n];

      if (check == 'a' || check == 'b' || check == 'c' || check == 'd'
      || check == 'e' || check == 'f' || check == 'g' || check == 'h'
      || check == 'i' || check == 'j' || check == 'k' || check == 'l'
      || check == 'm' || check == 'n' || check == 'o' || check == 'p'
      || check == 'q' || check == 'r' || check == 's' || check == 't'
      || check == 'u' || check == 'v' || check == 'w' || check == 'x'
      || check == 'y' || check == 'z') {
        if (check == 'a') { numVal.add(1);
        }else if (check == 'b') { numVal.add(2);
        }else if (check == 'c') { numVal.add(3);
        }else if (check == 'd') { numVal.add(4);
        }else if (check == 'e') { numVal.add(5);
        }else if (check == 'f') { numVal.add(6);
        }else if (check == 'g') { numVal.add(7);
        }else if (check == 'h') { numVal.add(8);
        }else if (check == 'i') { numVal.add(9);
        }else if (check == 'j') { numVal.add(10);
        }else if (check == 'k') { numVal.add(11);
        }else if (check == 'l') { numVal.add(12);
        }else if (check == 'm') { numVal.add(13);
        }else if (check == 'n') { numVal.add(14);
        }else if (check == 'o') { numVal.add(15);
        }else if (check == 'p') { numVal.add(16);
        }else if (check == 'q') { numVal.add(17);
        }else if (check == 'r') { numVal.add(18);
        }else if (check == 's') { numVal.add(19);
        }else if (check == 't') { numVal.add(20);
        }else if (check == 'u') { numVal.add(21);
        }else if (check == 'v') { numVal.add(22);
        }else if (check == 'w') { numVal.add(23);
        }else if (check == 'x') { numVal.add(24);
        }else if (check == 'y') { numVal.add(25);
        }else if (check == 'z') { numVal.add(26);
        }
      }
    }
    // for (int i=0; i<numVal.size(); i++) {
    //   System.out.println(numVal.get(i));
    // }
    return numVal;
  }

  public boolean compareNumVals(ArrayList<Integer> a1, ArrayList<Integer> a2){
    boolean change = false; //default
    for (int n = 0; n<a1.size() && n<a2.size(); n++) {
      if (a1.get(n) < a2.get(n)) {
        change = false;
        break;
      }else if (a1.get(n) > a2.get(n)) {
        change = true;
        break;
      }else {//if they equal
        System.out.println("next");//for test
      }
    }
    return change;
  }

  public void sortCitation(){
    //initiate values
    ArrayList<Citation> sortedList = new ArrayList<Citation>();
    Citation min = new Citation();
    int minIndex = 0;
    boolean change;

    //duplicate the list
    ArrayList<Citation> tempList = new ArrayList<Citation>();
    for (int h = 0; h < CarrayList.size(); h++ ) {//duplicating the list
      //purpose: to keep the length of the original list
      tempList.set(h, CarrayList.get(h));
    }

    for (int i = 0; i < CarrayList.size(); i++ ) {//number of minumum we need
      min = tempList.get(0);//track the minumum, always start from the 1st item
      for (int j = 0; j < tempList.size() ; j++ ) {//the method to find the minimum
        change = false;//default
        change = compareNumVals(CarrayList.get(minIndex).getNumVal(),
          CarrayList.get(j).getNumVal());
        if (change = true) {
          min = tempList.get(j);
        }
      }
      tempList.remove(min);
      sortedList.add(min);
    }
  }

  public void printCitationList(ArrayList<Citation> List){
    for (int h = 0; h < List.size(); h++ ) {
      System.out.println(List.get(h).formatIntoString());
    }
  }



  public static void main(String[] args) {
    CitationGenerator CG = new CitationGenerator();
    CG.assignNumVal("^&ERT256*YUDFGH");
    //add a new Citation





  }

}
