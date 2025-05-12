public class firstnonrepeatingchar{
    public static void main(String[] args) {
        String s="aabcdc";
        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
{
                System.out.println("First non-repeated character: " + s.charAt(i));
                return;
            }
        }
    }
}