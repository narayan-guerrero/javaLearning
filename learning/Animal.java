public class Animal{
    String name;
    public Animal(String name){
        this.name = name;
        System.out.println(this.name);
    }

    public String getName(){
	System.out.println("Hello I am " + this.name);
        return name;
    }
}

