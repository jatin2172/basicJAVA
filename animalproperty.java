//create a base class animal with attribute speak() then create dog and override the method
import java.util.*;
abstract class animal{
    String name;

    public animal(String name) {
        this.name=name;
    }
    
   abstract void speak();
    
}
class dog extends animal{
    public dog(String name){
        super(name);
    }
    @Override
    public void speak(){
        System.out.println(name+" says bho bho");
    }
}
public class animalproperty{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the dog name");
        dog d=new dog(sc.next());
        d.speak();
    }
}