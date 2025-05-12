import java.util.*;
public class weekdaylinkedlist{
    public static void main(String[] args) {
        LinkedList<String> weekdays= new LinkedList<>();
        weekdays.add("mon");
        weekdays.add("Tue");
        weekdays.add("Wed");
        weekdays.add("Thur");
        weekdays.add("Friday");
        weekdays.add("holiday");
        weekdays.add("holiday");
        for (String days : weekdays) {
            System.out.println(days);
        }
    }
}