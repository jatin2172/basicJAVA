//convert the string to upper case without using predefined method
public class convertupper{
    public static void main(String[] args) {
    String s="Surya";
    String result="";
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch>='a'&&ch<='z'){
            result+=(char)(ch-32);
        }
        else{
            result+=ch;
        }
    }
    System.out.println(result);
}
}