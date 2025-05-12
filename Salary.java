class Employee {
    protected double baseSalary;

    Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {

    Manager(double baseSalary) {
        super(baseSalary);
    }

    @Override
    public double getSalary() {
        return super.getSalary() * 1.10;
    }
}

public class Salary {
    public static void main(String[] args) {
        Employee emp = new Employee(5000);
        Manager mgr = new Manager(5000);

        System.out.println("Employee Salary: " + emp.getSalary());
        System.out.println("Manager Salary: " + mgr.getSalary());
    }
}