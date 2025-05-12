import java.util.*;
public class sortlistindescendingorder{
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        Collections.sort(number,new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                return b-a;
            }
        });
        System.out.println(number);
        ArrayList <Integer> num2 = new ArrayList<>();

num2.add(3);

num2.add(7);

num2.add(5);

num2.add(9);

num2.add(4);


Collections.sort(num2, (a,b) -> b-a);

System.out.println(num2);



ArrayList <String> colors = new ArrayList<>();
        
        colors.add("Red");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        
        Collections.sort(colors);
        
        System.out.println(colors);
        
        ArrayList <String> colors2 = new ArrayList<>();
        colors2.add("Red");
        colors2.add("Black");
        colors2.add("Blue");
        colors2.add("Green");
        
        System.out.println(colors2);
        
        Collections.sort(
                            
                        colors2, new Comparator<String>()
                        {
                            public int compare(String a, String b)
                            {
                                return b.compareTo(a);
                            }
                        }
            
                        );
        
        System.out.println(colors2);
        
        ArrayList <String> colors3 = new ArrayList<>();
        colors3.add("Red");
        colors3.add("Black");
        colors3.add("Blue");
        colors3.add("Green");
        
        System.out.println(colors3);
        
        Collections.sort(colors3, (a,b) -> b.compareTo(a));
        
        
        System.out.println(colors3);
        
        // s1.compareTo(s2)
        
        // 0 if s1 = s2
        // neg val (<0) if s1 < s2
        // pos val (>0) if s1 > s2
        
        
        System.out.println("a".compareTo("b"));
        System.out.println("b".compareTo("a"));
        System.out.println("a".compareTo("a"));
    }
}