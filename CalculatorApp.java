class basic{
    int add(int a,int b){
        return a+b;
    }
    double add(double  a,double  b){
        return a+b;
    }
    int substract(int a,int b){
        return a-b;
    }
    float divide(float a,float b){
        return a/b;
    }
    int multiply(int p,int q){
        return p*q;
    }
}
class scientific extends basic{
    int power(int x,int y){
        return (int)Math.pow(x,y);
    }
    double Sine(int d){
        return Math.sin(d);
    }
    double Cos(int d){
        return Math.cos(d);
    }
    double tan(int d){
        return Math.tan(d);
    }
    double logarithm(int d){
        return Math.log(d);
    }
}
public class CalculatorApp{
    public static void main(String[] args) {
        scientific s=new scientific();
        System.out.println("the addition of 3 and 4 is "+s.add(3, 4));
        System.out.println("the addition of 2.9 and 4.4 is "+s.add(2.9, 4.4));
        System.out.println("the substractiontion of 9 and 2 is "+s.add(9, 2));
        System.out.println("the multiion of 3 and 4 is "+s.multiply(3, 4));
        System.out.println("sin(3) is "+s.Sine(3));
        System.out.println("log(100)= "+s.logarithm(100));
    }
}