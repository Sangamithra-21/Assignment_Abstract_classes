package Assignment_13_Abstraction;

abstract class Employees{
    double salary;
    String name;
    int id;
    Employees(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    abstract void calculatePay();
    void getEmployeedetails()
    {
        System.out.println("Employee Name : "+name);
        System.out.println("Employee Id   : "+id);
    }
}
class HourlyEmployee extends Employees{
    int hrsworked;
    HourlyEmployee(String name, int id,int hrs) {
        super(name, id);
        hrsworked=hrs;
    }

    @Override
    void calculatePay() {
        salary=hrsworked*50;
        super.getEmployeedetails();
        System.out.println("Salary        : "+salary);
        System.out.println("----------------------------------------------------------------------");
    }
}
class SalariedEmployee extends Employees{
    int days;
    SalariedEmployee(String name, int id,int days) {
        super(name, id);
        this.days=days;
    }

    @Override
    void calculatePay() {
        salary=days*500;
        super.getEmployeedetails();
        System.out.println("Salary        : "+salary);
        System.out.println("----------------------------------------------------------------------");

    }
}
public class EmployeesDemo{
    public static void main(String[] args) {
        Employees emp1=new HourlyEmployee("Mithra",21,8);
        Employees emp2=new SalariedEmployee("Kavi",12,30);
        emp1.calculatePay();
        emp2.calculatePay();
    }
}