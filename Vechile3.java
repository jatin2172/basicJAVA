abstract class vechile{
    abstract void start();
}
class Car extends vechile{
    @Override
    void start(){
        System.out.println("Car started");
    }
}
class Bike extends vechile{
    @Override
     void start(){
        System.out.println("Bike started");
     }
}
public class Vechile3{
    public static void main(String[] args) {
        vechile v1=new Car();
        vechile v2=new Bike();
        v1.start();
        v2.start();
    }
}
