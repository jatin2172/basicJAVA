abstract class Shape 
    {
    // abstract double area_c(double radius); 
    // abstract double area_r(double length, double breadth);
    abstract double area();
    }

class Circle extends Shape 
    {
        double radius;
        
        public Circle(double r)
        {
            this.radius = r;
        }
        
        @Override
        double area(){
            return Math.PI*radius*radius;
        }
    }
class Rectangle extends Shape
    {
        double length, breadth;
        
        public Rectangle(double l, double b)
        {
            this.length = l;
            this.breadth = b;
        }
        
        @Override
        double area(){
            return length*breadth;
        }
    } 
    
    public class area{
        public static void main(String[] args) {
            Circle c = new Circle(5.5);
            System.out.println("Area of Circle: " + c.area());
            
            Rectangle r = new Rectangle(3.5, 4.0);
            System.out.println("Area of Rectangle: " + r.area());
        }
    }
