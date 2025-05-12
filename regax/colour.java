//given an array of string match either "color" or "colour" but not "colr"
import java.util.regex.*;
public class colour{
    public static void main(String[] args) {
        String[] test={"colour","color","colr"};
        String group="colou?r";//? used for 0 or more occurance of u in this
        Pattern p=Pattern.compile(group);
        for(String word:test){
            System.out.println(word+"->"+p.matcher(word).matches());
        }
    }
}