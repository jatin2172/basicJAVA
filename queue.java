import java.util.*;
public class queue{
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.offer(20);
        q.offer(30);
        q.offer(40);
        System.out.println(q);
        q.add(10);
        q.add(50);
        q.add(60);
        System.out.println(q);
        q.poll();
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println("The top element after deletion is "+q.peek());
        for(int n:q){
            System.out.println(n);
        }
    }
}