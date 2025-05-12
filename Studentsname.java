class Students{
    private String name;
    private int marks;
    public Students(String name,int marks){
        this.name=name;
        this.marks=marks;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int  getmarks(){
        return marks;
    }
    public void  setmarks(int marks){
        this.marks=marks;
    }
    public void display(){
        System.out.println("Student="+name+",mark="+marks);
    }
}
    public class Studentsname{
    public static void main(String[] args) {
        Students s=new Students("surya", 90);
        s.display();
    }
}