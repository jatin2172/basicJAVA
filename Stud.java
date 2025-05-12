class Student{
    String name;
    int age;
    public Student(){
        System.out.println("It is the default constructer");
    }
    public Student(String name){
        this.name=name;
        System.out.println("Name"+name+"Age"+"not given");
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Name"+name+"Age"+age);
    }

}
public class Stud{
    public static void main(String[] args) {
        Student s=new Student();
    new Student("Surya");
    new Student("Jatin",19);

    }
}