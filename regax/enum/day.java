public class day{
    enum Days {MONDAY,TUESDAY,WEDNESDAY,THRUSDAY,FRIDAY,SATURDAY};
    public static void main(String[] args){
        Days[] day1=Days.values();
        for(Days d:day1){
            System.out.println(d);
        }
        System.out.println(Days.valueOf("FRIDAY"));
    }
}