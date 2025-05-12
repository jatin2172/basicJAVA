abstract class shap{
    abstract void draw();
}
class circle extends shap{
    @Override
    public void draw(){
        System.out.println("Draw a circle");
    }
}
class square extends shap{
    @Override
    public void draw(){
        System.out.println("draw a Square");
    }
}
public class Shape{
    public static void main(String[] args) {
        circle c=new circle();
        c.draw();
        square s=new square();
        s.draw();
    }
}