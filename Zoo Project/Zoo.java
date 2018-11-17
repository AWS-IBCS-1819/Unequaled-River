/* Created by Kitty Liu
*/
import java.util.*;
import java.io.*;

public class Zoo {

  public static String noFormat(String before){
    String after = before.trim().replaceAll(" ","");
    String noFormat = after.toLowerCase();

    return noFormat;
  }

  public static void chooseAnimalActionsZookeeper(Animal animal){
    System.out.println("What do you want to do with that animal?");
    System.out.println("1. view its name");
    System.out.println("2. view its weight");
    System.out.println("3. view its color");
    System.out.println("4. learn interesting facts about that animal");
    System.out.println("5. edit its name");
    System.out.println("6. edit its weight");
    System.out.println("7. edit its color");
    System.out.println("8. edit the interesting facts");

    Scanner sc1 = new Scanner(System.in);
    String todo = sc1.next();
    if (todo.equals("1")) {
      System.out.print("Name: ");
      System.out.println(animal.getName() + "! Yeah!");

    }else if (todo.equals("2")) {
      System.out.print("Weight: ");
      System.out.println(animal.getWeight() + "! Yeah!");

    }else if (todo.equals("3")) {
      System.out.print("Color: ");
      System.out.println(animal.getColor() + "! Yeah!");

    }else if (todo.equals("4")) {
      System.out.print("Interesting facts: ");
      System.out.println(animal.getInfo() + "! Yeah!");

    }else if (todo.equals("5")||todo.equals("6")||todo.equals("7")||todo.equals("8")) {
      System.out.println("What do you want to change it to?");
      Scanner sc2 = new Scanner(System.in);
      String userChange = sc2.next();

      if (todo.equals("5")) {
        animal.setName(userChange);
        System.out.println("Current name is:" + animal.getName());

      }else if (todo.equals("6")) {
        animal.setWeight(userChange);
        System.out.println("Current weight is:" + animal.getWeight());

      }else if (todo.equals("7")) {
        animal.setColor(userChange);
        System.out.println("Current color is:" + animal.getColor());

      }else if (todo.equals("8")) {
        animal.setInfo(userChange);
        System.out.println("Current interesting fact is:" + animal.getInfo());
      }


    }

    else{
      System.out.println("We don't have that option");
    }
  }

  public static void chooseAnimalActionsVisitor(Animal animal){
    System.out.println("What do you want to do with that animal?");
    System.out.println("1. view its name");
    System.out.println("2. view its weight");
    System.out.println("3. view its color");
    System.out.println("4. learn interesting facts about that animal");

    Scanner sc1 = new Scanner(System.in);
    String todo = sc1.next();
    if (todo.equals("1")) {
      System.out.print("Name: ");
      System.out.println(animal.getName() + "! Yeah!");

    }else if (todo.equals("2")) {
      System.out.print("Color: ");
      System.out.println(animal.getWeight() + "! Yeah!");

    }else if (todo.equals("3")) {
      System.out.print("Color: ");
      System.out.println(animal.getColor() + "! Yeah!");

    }else if (todo.equals("4")) {
      System.out.print("Interesting facts: ");
      System.out.println(animal.getInfo() + "! Yeah!");

    }else{
      System.out.println("We don't have that option");
    }
  }

  public static void main(String[] args) {
    //constructor methods
    Zoo newzoo = new Zoo();

    //new animals
    Animal alpaca = new Animal();
    alpaca.newInfo("Alpaca", "127 lbs", "white", "Alpaca can cross-breed with llama. ");
    Animal minilop = new Animal();
    minilop.newInfo("Mini Lop", "6.5 lbs", "grey", "The Mini Lion Lop has been produced by breeding the Lionhead with Mini Lops and Lionhead/Mini Lop hybrids. ");
    Animal hedgehog = new Animal();
    hedgehog.newInfo("Hedgehog", "1.1 lbs", "grey", "Just like moles and opossums, hedgehogs are immune to snake venom. ");
    Animal hamster = new Animal();
    hamster.newInfo("Hamster", "1.3 lbs", "white", "Like other rodents, a hamster's teeth grow continuously throughout their lifetime. ");

    Animal chameloen = new Animal();
    chameloen.newInfo("Chameloen", "80 gram", "green", "When frightened, pygmies can vibrate or buzz in order to attempt to intimidate other chameleons or predators. ");
    Animal kingsnake = new Animal();
    kingsnake.newInfo("Kingsnake", "3.3 lbs", "red", "Kingsnakes are one of the most popular and collected species of snakes due to their adaptability as pets and ease of care. ");
    Animal lizard = new Animal();
    lizard.newInfo("Lizard", "1.1 lbs", "brown", "Some lizards can detach their tails if caught by predators. ");
    Animal speckledcapetortoise = new Animal();
    speckledcapetortoise.newInfo("Speckled cape tortoise", "4.1 lbs", "black", "It is the smallest tortoise. ");
    //new enclosure
    Enclosure mammal = new Enclosure();
    Enclosure reptile = new Enclosure();
    mammal.newInfo("mammal", "Mrs.Jack", "8:00 am -- 5:00 pm");
    reptile.newInfo("reptile", "Ms.Lily", "10:00 am -- 7:00 pm");

    //ArrayList of animals
    ArrayList<Animal> mammalLine = new ArrayList<Animal>();
    mammalLine.add(alpaca);
    mammalLine.add(minilop);
    mammalLine.add(hedgehog);
    mammalLine.add(hamster);


    ArrayList<Animal> reptileLine = new ArrayList<Animal>();
    reptileLine.add(chameloen);
    reptileLine.add(kingsnake);
    reptileLine.add(lizard);
    reptileLine.add(speckledcapetortoise);

    //ArrayList of enclosure
    ArrayList<Enclosure> encloList = new ArrayList<Enclosure>();
    encloList.add(mammal);
    encloList.add(reptile);

    //to link them
    Map<String, ArrayList> mammalHolder = new HashMap<String, ArrayList>();
    mammalHolder.put(mammal.getName(), mammalLine);
    Map<String, ArrayList> reptileHolder = new HashMap<String, ArrayList>();
    reptileHolder.put(reptile.getName(), reptileLine);







    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------


    System.out.println("Welcome to the indoor petting zoo!");
    System.out.println("Where do you want to go?");
    //print all enclosures
    for (int i = 0; i < encloList.size(); i++) {
      int numfront = i+1;
      System.out.println(numfront + ". " + encloList.get(i).getName() + " house");
    }
    //------
    Scanner sc = new Scanner(System.in);
    String a = sc.next();

//------------------------------------------------------------------------------
    Animal chosenM = new Animal(); //to prevent java not recognized any
    Map<String, ArrayList> tempM = new HashMap<String, ArrayList>();
    ArrayList<Animal> tempA = new ArrayList<Animal>();

    if (a.equals("1")) {
      tempM = mammalHolder;
      tempA = mammalHolder.get(mammal.getName());
      System.out.println("Welcome to " + mammal.getName() + " house");

    }else if (a.equals("2")) {
      tempM = mammalHolder;
      tempA = mammalHolder.get(reptile.getName());
      System.out.println("Welcome to " + reptile.getName() + " house");

    }

//------------------------------------------------------------------------------
    System.out.println("Choose an animal to learn more about it!");
      //print all mammal
      for (int i = 0; i < tempA.size(); i++) { //why only 1st one printed
        int num1 = i+1;
        System.out.println(num1 + ". " +tempA.get(i).getName());
      }

      Scanner chooseM = new Scanner(System.in);
      int chosenMindex = chooseM.nextInt();
      //fetch that animal from the ArrayList
      chosenM = tempA.get(chosenMindex-1);

//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------

    System.out.println("Who do you want to be? The visitor or the zookeeper?");
    System.out.println("(You can be zookeeper for one animal and visitor for another)");
    Scanner vz = new Scanner(System.in);
    String z = vz.next();
    if (z.equals("visitor")){
      newzoo.chooseAnimalActionsVisitor(chosenM);
    }else if (z.equals("zookeeper")) {
      newzoo.chooseAnimalActionsZookeeper(chosenM);
    }

  }
}
