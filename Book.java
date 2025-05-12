public class Book{
    String title;
    String author;
    public Book(){
        this.title="NA";
        this.author="NA";
    }
    public Book(String title){
        this.title=title;
        this.author="NA";
    }
    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    public void display(){
        System.out.println("Book title is="+title);
        System.out.println("Book author is="+author);
    }
    public static void main(String[] args) {
        System.out.println("B1");
        Book b1=new Book();
        // b1.title="life of aj";
        // b1.author="aj";
        b1.display();
        System.out.println("B2");
        Book b2=new Book("Life of AJ");
        b2.display();

        System.out.println("B3");
        Book b3=new Book("Life", "Surya");
        b3.display();
    }
}