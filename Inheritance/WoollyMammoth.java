public class WoollyMammoth extends Proboscidea {

    // the MountainBike subclass adds one field
    public int hair;

    // the MountainBike subclass has one constructor
    public WoollyMammoth(int hairLength,
                        String earSize,
                        String colors,
                        int trunkSize) {
        super(earSize, colors, trunkSize);
        hair = hairLength;
    }

    // the MountainBike subclass adds one method
    public void setHair(int newValue) {
        hair = newValue;
    }
    public static void main(String[] args) {
      WoollyMammoth m = new WoollyMammoth(5, "small", "brown", 100);
      System.out.println("Hair length = " + m.hair);// + Integer.toString(hair)

    }
}
