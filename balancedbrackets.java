//A string is balanced if every opening bracket has a closing bracket in the correct order
import java.util.*;
public class balancedbrackets{
    public static void main(String[] args) {
        String[] ip={"[","{","(",")","}","]"};
        Stack<String> st = new Stack<>();
        for(var ch:ip){
            if (ch == "(" || ch == "[" || ch == "{") {
                st.push(ch);
        }
        else if(ch == ")" || ch == "]"|| ch == "}"){
            st.pop();
        }
    }
    if(st.isEmpty()){
        System.out.println("Balanced Bracket");
    }
    else{
        System.out.println("Not Balanced Bracket");
    }
}
}