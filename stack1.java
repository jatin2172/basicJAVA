import java.util.*;
public class stack1{
    public static void main(String[] args){
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        int n=stack.pop();
        System.out.println(n+" is removed");
        System.out.println("after remove "+stack);
        System.out.println("the new top element is "+stack.peek());
        System.out.println("is the stack is empty?"+stack.empty());
        System.out.println("the position of 30 is "+stack.search(30));
        for (var elem : stack) {
            System.out.println(elem);
        }
        while(!stack.empty()){
            stack.pop();
        }
        System.out.println(stack);
    }
}