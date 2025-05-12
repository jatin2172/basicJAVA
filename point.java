public class point{
    int x,y;

    public point(){
        this.x=0;
        this.y=0;
    }
    public point(int a,int b){
        this.x=a;
        this.y=b;
    }
    @Override
        public String toString(){
            return "X cordinate is"+x+"  Y coordinate is"+y;
        }
    public static void main(String[] args) {
        point p1=new point();
        point p2=new point(2,6);

        

        System.out.println("P1 is"+p1);
        System.out.println("P2 is"+p2);
        System.out.println("P1 is"+p1.x);
        System.out.println("P2 is"+p2.x);
    }
}