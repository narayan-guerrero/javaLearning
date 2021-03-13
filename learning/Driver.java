public class Driver{
    public static void main(String[] args){
        Can darkSoda = new Can("Cola");
        Can lightSoda = new Can("7up");
        Can fizzyWater = new Can("La Croix");

        darkSoda.pour();
        darkSoda.getLevel();

        lightSoda.getLevel();
        fizzyWater.getLevel();

        Can.factory();
        Array myarray = { 1, 2, 3 };

        for (int i = 0; i < myarray.length; i++) {
          System.out.println(myarray[i]);
        }
    }
}

