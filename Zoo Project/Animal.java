/* Created by Kitty Liu
*/

public class Animal {

  String name;
  String weight;
  String color;
  String info;

  public void newInfo (String n, String w, String c, String i) {
    name = n;
    weight = w;
    color = c;
    info = i;
  }

  public void setName(String n) {
    name = n;
  }

  public void setWeight(String w) {
    weight = w;
  }

  public void setColor(String c) {
    color = c;
  }

  public void setInfo(String i) {
    info = i;
  }

  public String getName() {
    return name;
  }

  public String getWeight() {
    return weight;
  }

  public String getColor() {
    return color;
  }

  public String getInfo() {
    return info;
  }

  public Animal() {
    name = "";
    weight = "";
    color = "";
    info = "";
  }

}
