//separate by comma(,)
public class comma{
    public static void main(String[] args) {
        String ip="apple,banana,grapes";
        String[] words=ip.split(",");
        for(String word:words){
            System.out.println(word);
        }
    }
}