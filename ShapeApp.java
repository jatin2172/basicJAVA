abstract class Shape{
    abstract double area();
    abstract double perimeter();
}
class circle extends Shape{
    private double r;
    public circle(double r){
        this.r=r;
    }
    public double area(){
        return Math.PI*r*r;
    }
    public double perimeter(){
        return 2*Math.PI*r;
    }
}
class Rectangle extends Shape{
    private double l,b;
    public Rectangle(double l,double b){
        this.l=l;
        this.b=b;
    }
    public double area(){
        return l*b;
    }
    public double perimeter(){
        return 2*(l+b);
    }
}
class ShapeApp{
    public static void main(String[] args) {
        Shape[] s={new circle(2.5),new Rectangle(3,4)};
        for(Shape sh:s){
            System.out.println(sh.getClass().getSimpleName()+" area="+sh.area()+" perimeter= "+sh.perimeter());
        }
    }
}