import java.util.ArrayList;
public class arraylistchar{
    public static void main(String[] args) {
        ArrayList<Character> letters=new ArrayList<>();
        letters.add('A');
        letters.add('B');
        letters.add('C');
        letters.add('D');
        letters.add('E');
        System.out.println("Element at index 2:"+letters.get(2));
    }
}