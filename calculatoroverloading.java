public class calculatoroverloading{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int x,int y,int z){
        return x+y+z;
    }
    public double add(double p,double q){
        return p+q;
    }
    public static void main(String[] args) {
        calculatoroverloading c=new calculatoroverloading();
        System.out.println("2+3+4="+c.add(2,3,4));
        System.out.println("8+9="+c.add(8,9));
        System.out.println("10.5+11.73="+c.add(10.5,11.73));
    }
}