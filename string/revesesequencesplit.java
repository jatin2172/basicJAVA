//reverse the sequence of word with split method
public class revesesequencesplit{
    public static void main(String[] args) {
        String s="Hello Student welcome to AJ sir programming";
        String[] word=s.split(" ");
        String ss="";
        for(int i=word.length-1;i>=0;i--){
            ss=ss+word[i]+" ";
        }
        System.out.println(ss);
    }
}