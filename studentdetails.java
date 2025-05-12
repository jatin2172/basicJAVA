//define a class student with name and age read student name and age from input
import java.util.*;
class student{
    String name;
    int age;
    public student(String name,int age) {
        this.name=name;
        this.age=age;
    }
    void displaydetails(){
        System.out.println("Student name: "+name+",Age: "+age);
    }
    
}
public class studentdetails{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name and age of the student");
        student s1=new student(sc.next(), sc.nextInt());
        s1.displaydetails();
    }
}