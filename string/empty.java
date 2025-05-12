//implement isEmpty wthout using it
public class empty{
    void isitempty(String s){
        if(s.equals("")){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
    public static void main(String[] args) {
        String str="string";
        empty e=new empty();
        e.isitempty(str);
    }
}