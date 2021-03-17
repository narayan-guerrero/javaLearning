/*
Selection: Determining which path a program takes.

boolean isHired = true;

Animal bear = new Animal("teddy");
if (bear.name == "Teddy"){
  System.out.println("You are hired");
}

else {
 System.println("Go away");
}

*/

public class Selection {
    public static void  main(String[] args){
      Animal bear = new Animal("Teddy");
      Animal wolf = new Animal("Kitty");
      Animal snake = new Animal("Solid");
      
      Animal[] zoo = { bear, wolf, snake };

      for (int i = zoo.length - 1; i >= 0; i--) {
        System.out.println(zoo[i].getName());
      }

      for (Animal zoo_element: zoo) {
        System.out.println(zoo_element.getName());
      }
      
      
    }

}

