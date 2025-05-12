public class sillyanimal{
    String type;
    int age;
    public void display(){
        System.out.println("Type="+type+" "+"Age="+age);
    }
    public static void main(String[] args) {
        sillyanimal s=new sillyanimal();
        s.type="cat";
        s.age=3;
        s.display();
    }
}