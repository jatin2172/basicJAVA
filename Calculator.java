public class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public static void main(String[] args) {
        Calculator c=new Calculator();
        int addres=c.add(4, 6);
        int subres=c.sub(5,2);
        System.out.println("Addition "+addres);
        System.out.println("Substraction "+subres);
    }
}