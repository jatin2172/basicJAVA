//USE AN ENUM TO REPRESENT RED GREEN AND YELLOW TRAFFIC LIGHT AND PRINT MESSAGE BASED ON THAT LIGHT
public class traffic {

    public enum Signal {
        RED,YELLOW,GREEN
        }

    public static void main(String[] args) {
        Signal s= Signal.RED;
        switch(s)
        {
            case RED: 
            System.out.println("please stop");
            break;
            case GREEN:
            System.out.println("go ahead");
            break;
            case YELLOW:  System.out.println("GO slowly");
    }
}
}