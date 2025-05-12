//reverse the sequence of word
public class revesesequence{
    public static void main(String[] args) {
        String s="Hello Student welcome to AJ sir programming";
        String ss="";
        String word="";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                ss=ss+word+" ";
                word="";
            }
            else{
                word=s.charAt(i)+word;
            }
        }
        ss = ss + word; // append the last word after loop
        System.out.println(ss);
    }
}