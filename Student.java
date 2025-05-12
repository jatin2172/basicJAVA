public class Student{
    private String name;
    public Student(String name){
        this.name=name;
    }
    public Student(){
        this("Unknown");
    }
    public void PrintName(){
        System.out.println("Name: "+this.name);
    }
    public static void main(String[] args) {
        new Student().PrintName();
        new Student("Alice").PrintName();
    }
}