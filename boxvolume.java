//create a class box with private dimentions  and a constructer to initialize the fields read dimention from input and show the volume
import java.util.*;
class Box {
    private int length, width, height;
    public Box(int length, int width, int height) {
    this.length = length;
    this.width = width;
    this.height = height;
    }
    public int getVolume() {
    return length * width * height;
    }
   }
   
   
   public class boxvolume {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter length");
    int length = scanner.nextInt();
    System.out.println("Enter width");
    int width = scanner.nextInt();
    System.out.println("Enter height");
    int height = scanner.nextInt();
    
    Box box = new Box(length, width, height);
    
    System.out.println("Volume: " + box.getVolume());
    
    scanner.close();
    }
   }