abstract class Animal{
    abstract void makesound();
void eat(){
    System.out.println("The animal eats food");
}
}
class dog extends Animal{
    @Override
    public void makesound(){
        System.out.println("Bark");
    }
}
public class overrire{
    public static void main(String[] args) {
        dog d=new dog();
        d.makesound();
        d.eat();
    }

}