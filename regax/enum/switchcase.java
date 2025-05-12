public class switchcase {

    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Day day = Day.FRIDAY;

        switch (day) {
            case SUNDAY:
                System.out.println("Today is Sunday, time to relax!");
                break;
            case MONDAY:
                System.out.println("It's Monday, start of the work week.");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday, keep going!");
                break;
            case WEDNESDAY:
                System.out.println("Happy Wednesday, halfway through the week!");
                break;
            case THURSDAY:
                System.out.println("It's Thursday, the weekend is near!");
                break;
            case FRIDAY:
                System.out.println("It's Friday, time to wrap up the week!");
                break;
            case SATURDAY:
                System.out.println("It's Saturday, enjoy your weekend!");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}