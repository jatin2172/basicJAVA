//write a cpode to print index of 2nd occurance of a character without using loop
public class secondoccurance{
    public static void main(String[] args) {
        String s="Surya Prakash Das";
        char ch='a';
        int first=s.indexOf(ch);
        System.out.println(first);
        int second=s.indexOf(ch, first+1);
        System.out.println(second);
        System.out.printf("Second occurrence of '%c' is at index: %d%n", ch, second);

    }
}