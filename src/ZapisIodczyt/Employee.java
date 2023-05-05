package src.ZapisIodczyt;

public class Employee extends Person{

    private double salary;

    public Employee(String name, String lastName, double salary) {
        super(name, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ",wypata " + salary;
    }
}
