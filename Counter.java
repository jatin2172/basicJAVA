public class Counter{
    public static int count=0;
    public String id;
    public Counter(String id){
        this.id=id;
        count++;
    }
    public static int getcount(){
        return count;
    }
    public void showinfo(){
        System.out.println("Object"+id+"creted");
    }
    public static void main(String[] args) {
        Counter a=new Counter("a1");
        Counter b=new Counter("b1");
        a.showinfo();
        b.showinfo();
        System.out.println("Total objects:"+Counter.getcount());
    }
}