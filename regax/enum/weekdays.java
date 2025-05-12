import java.util.*;
public class weekdays{
    enum Days {SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY};
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Days day = Days.valueOf(sc.next().toUpperCase());

        switch (day)
        {
            case SUNDAY:
                System.out.println("Weekend");
                break;
            case MONDAY :
            System.out.println("WEEDDays");
                break;
            case TUESDAY:
            System.out.println("WEEDDays");
                break;
            case WEDNESDAY:
            System.out.println("WEEDDays");
                break;
                case THRUSDAY:
                System.out.println("WEEDDays");
                break;
                case FRIDAY:
                System.out.println("WEEDDays");
                break;
                case SATURDAY:
                System.out.println("Weekend");
                break;
        }
    }
}