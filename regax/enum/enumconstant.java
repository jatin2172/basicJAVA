public class enumconstant{
    enum Animals{
        CAT, DOG
    }
    public static void main(String[] args) {
        Animals[] ani= Animals.values();

        
            System.out.println(ani[1]);
        
    }
}
