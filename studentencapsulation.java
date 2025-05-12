//define a class person with private fields name and age.provide public getter and setter methods for these field
import java.util.*;
class person{
    private String name;
   private  int age;
   
   public person(String name,int age) {
    this.name=name;
    this.age=age;
   }
// Getter for name
public String getName() {
    return name;
}

// Setter for name
public void setName(String name) {
    this.name = name;
}

// Getter for age
public int getAge() {
    return age;
}

// Setter for age
public void setAge(int age) {
    this.age = age;
}
   
    void displaydetails(){
        System.out.println("Student name: "+name+",Age: "+age);
    }
    
}
public class studentencapsulation{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name and age of the student");
        person p1=new person(sc.next(), sc.nextInt());
        p1.displaydetails();
    }
}