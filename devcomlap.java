class Device{
    String name;
    public Device(String name) {
        this.name = name;
        System.out.println("Device class created!!");
    }    
} 
class Computer extends Device {
    public Computer(String name) {
        super(name);
         System.out.println("Computer class created!!");
    } 
}
class Laptop extends Computer{
    public Laptop(String name){
        super(name);
        System.out.println("Laptop class created!!");
    }
}
    public class devcomlap{
    public static void main(String[] args) {
         new Laptop("HP");
    }
}