class Animal{
    String name;
    public Animal(String name) {
        this.name = name;
    }
    public void makeSound() {
        System.out.println("Animal  makes a sound.");
    }
    public void move() {
        System.out.println( "Animal moves.");
    }

} 
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        super.makeSound(); // Calls the parent class method
        System.out.println(name + " Says: Bhoo Bhoo.");
    }
    @Override
    public void move() {
        super.move(); 
        System.out.println(name + " runs.");
    }
    public void fetch() {
        System.out.println(name + " fetches the ball.");
    }
}
public class animal2{
    public static void main(String[] args) {
        Dog d= new Dog("Buddy");
        d.makeSound(); 
        d.move();
        d.fetch();
    }
    
}