public class Can{
  String brand;
  boolean isFull = false;
  boolean isOpen = false;
  int level = 100;
  public static void factory(){
    System.out.println("Hello I am the Can factory static method");
  }

  public Can(String brand){
    this.brand = brand;
  }

  public void pour(){
    if (this.level >= 0){
       this.level -= 5;
    }
  }
  public int getLevel(){
     System.out.println(this.brand + " has " + this.level + "% left");
     return this.level;
  }
}

