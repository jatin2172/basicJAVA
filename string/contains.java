//implement contains() without using it
public class contains{
    public static void main(String[] args) {
        String s="java programming";
        int n=s.indexOf("java");
        if(n!=-1){
            System.out.println("contains");
        }
        else{
            System.out.println("doesnot contains");
        }
    }
}