public class Vehicle{
    String brand;
    int year;
    public Vehicle(String brand,int year){
        this.brand=brand;
        this.year=year;
    }
    public void show(){
        System.out.println("Brand="+brand+"   "+"Year="+year);
    }
    public static void main(String[] args) {
        Vehicle v=new Vehicle("Toyota", 2020);
        v.show();
    }
}