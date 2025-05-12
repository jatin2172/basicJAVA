import java.util.regex.*;
public class alphanumeric{
    public static void main(String[] args) {
        String s="Surya_2006";
        String containsspace="^\\w+$";
        Pattern p=Pattern.compile(containsspace);
        boolean ok=p.matcher(s).matches();
        System.out.println(ok);
    }
}
