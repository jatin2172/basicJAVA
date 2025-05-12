//given a sentence where each word is space separated,count no of words in it
public class noofwords{
    public static void main(String[] args) {
        String s="Surya Prakash Das";
        int i,count=1;
        for(i=0;i<s.length();i++)
        if(s.charAt(i)==' '){
            count++;
            i++;
        }
        System.out.println("no of words="+count);
    }
}