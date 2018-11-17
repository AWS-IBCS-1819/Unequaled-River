public class Enclosure{

  public String name;
  public String zookeeper;
  public String time;

  public void newInfo (String n, String z, String t) {
    name = n;
    zookeeper = z;
    time = t;
  }

  public String getName(){
    return name;
  }

  public void setName(String n){
    name = n;
  }

  public String getTime(){
    return time;
  }

  public void setTime(String t){
    time = t;
  }

  public String getPerson(){
    return zookeeper;
  }

  public void setPerson(String z){
    zookeeper = z;
  }

  public Enclosure(){
    name = "";
    zookeeper = "";
    time = "";
  }
}
