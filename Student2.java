class Student2{
    String name;
    int age;
    
    public Student2()
    {
        this("NA", 0);
    }
    
    public Student2(String n, int a)
    {
        this.name = n;
        this.age = a;
    }
    
    
    //copy constructor
    public Student2(Student2 st)
    {
        this.name = st.name;
        this.age = st.age;
    }
    
    public void displayInfo()
    {
        System.out.println("Name : "  + name + ", Age : " + age);
    }
    //copy constructor
    
    public static void main(String[] args)
    {
        Student2 st1 = new Student2("Raj", 20);
        Student2 st2 = new Student2(st1);
        
        st1.displayInfo();
        st2.displayInfo();
    }
    
    
}