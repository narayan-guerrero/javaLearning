public class Animal{
   private String name;
   public Animal(String name){
      this.name = name;
   }
   public String getName(){
      return this.name; 
   }
   public void setName(String newName){
      if (newName == "Gohan") {
          System.out.println("No I dont like that name");
          return;
      }
      this.name = newName;
  }
}

// Animal bear = new Animal('Teddy');
