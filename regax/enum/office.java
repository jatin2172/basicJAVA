public class office{
    enum Employee{
        MANEGER, ADMIN, STAFF
    }
    public static void main(String[] args) {
        
    Employee s= Employee.ADMIN;
    switch(s)
    {
        case ADMIN: 
            System.out.println("CAN DO ANYTHING");
            break;
        case MANEGER:
            System.out.println("ONLY ISSUES REALTED TO STAFF AND TEAM");
            break;
        case STAFF: 
            System.out.println("ONLY WORK");


    }
}
}
