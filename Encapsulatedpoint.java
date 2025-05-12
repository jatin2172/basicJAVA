class Encapsulatedpoint1{
    private int x;
    private int y;
    public Encapsulatedpoint1(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int  getY(){
        return y;
    }
}
public class Encapsulatedpoint{
public static void main(String[] args) {
    Encapsulatedpoint1 p=new Encapsulatedpoint1(2, 3);
    System.out.println("Point:("+p.getX()+" "+p.getY()+")"); 
}
}