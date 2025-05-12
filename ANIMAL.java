class Anima
{
    String name;
    public Anima(String name){
        this.name=name;
    }
    public void sound(){
        System.out.println("Parent class Sound");
    }
}
class Dog extends Anima{
    public Dog(String name){
        super(name);
    }
    @Override
    public void sound(){
        System.out.println(name+" says:Woof!");
    }
}
public class ANIMAL{
    public static void main(String[] args) {
        Dog d1=new Dog("Dollar");
        d1.sound();
    }
}